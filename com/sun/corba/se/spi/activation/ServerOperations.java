package com.sun.corba.se.spi.activation;


/**
* com/sun/corba/se/spi/activation/ServerOperations.java .
* Generated by the IDL-to-Java compiler (portable), version "3.2"
* from ../../../../src/share/classes/com/sun/corba/se/spi/activation/activation.idl
* Thursday, December 18, 2014 9:44:16 PM PST
*/


/** Server callback API, passed to Activator in active method.
    */
public interface ServerOperations 
{

  /** Shutdown this server.  Returns after orb.shutdown() completes.
  	*/
  void shutdown ();

  /** Install the server.  Returns after the install hook completes
  	* execution in the server.
  	*/
  void install ();

  /** Uninstall the server.  Returns after the uninstall hook
  	* completes execution.
  	*/
  void uninstall ();
} // interface ServerOperations
