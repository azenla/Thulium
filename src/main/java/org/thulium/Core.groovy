package org.thulium

import org.codehaus.groovy.control.CompilerConfiguration
import org.kohsuke.groovy.sandbox.SandboxTransformer

class Core
{

   private static def cc
   private static def shell
   private static def sandbox

   static void main(String[] args)
   {
      sandbox = new ThuliumSandbox()
      cc = new CompilerConfiguration()
      cc.setScriptBaseClass("org.thulium.ThuliumScript")
      cc.addCompilationCustomizers(new SandboxTransformer())
      shell = new GroovyShell(cc)
      sandbox.register()
      def s = new Result(shell.evaluate("StrLen(\"Hello World!\")"))
      println(s.result)
   }

   static Result evaluate(def eval)
   {
      shell.evaluate()
   }

}
