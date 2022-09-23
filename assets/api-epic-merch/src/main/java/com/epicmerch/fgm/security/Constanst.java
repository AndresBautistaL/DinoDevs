package com.epicmerch.fgm.security;

public class Constanst {
	  // Spring Security

  public static final String LOGIN_URL = "/login";
  public static final String HEADER_AUTHORIZACION_KEY = "Authorization";
  public static final String TOKEN_BEARER_PREFIX = "Bearer ";

  // JWT

  public static final String ISSUER_INFO = "https://mexico.generation.org/";
  public static final String SUPER_SECRET_KEY = "epic-merch-2022";
  public static final long TOKEN_EXPIRATION_TIME = 864_000; // 10 day
}