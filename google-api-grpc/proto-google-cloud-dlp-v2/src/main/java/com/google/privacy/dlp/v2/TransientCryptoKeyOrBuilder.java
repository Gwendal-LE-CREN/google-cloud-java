// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: google/privacy/dlp/v2/dlp.proto

package com.google.privacy.dlp.v2;

public interface TransientCryptoKeyOrBuilder extends
    // @@protoc_insertion_point(interface_extends:google.privacy.dlp.v2.TransientCryptoKey)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <pre>
   * Name of the key. [required]
   * This is an arbitrary string used to differentiate different keys.
   * A unique key is generated per name: two separate `TransientCryptoKey`
   * protos share the same generated key if their names are the same.
   * When the data crypto key is generated, this name is not used in any way
   * (repeating the api call will result in a different key being generated).
   * </pre>
   *
   * <code>string name = 1;</code>
   */
  java.lang.String getName();
  /**
   * <pre>
   * Name of the key. [required]
   * This is an arbitrary string used to differentiate different keys.
   * A unique key is generated per name: two separate `TransientCryptoKey`
   * protos share the same generated key if their names are the same.
   * When the data crypto key is generated, this name is not used in any way
   * (repeating the api call will result in a different key being generated).
   * </pre>
   *
   * <code>string name = 1;</code>
   */
  com.google.protobuf.ByteString
      getNameBytes();
}
