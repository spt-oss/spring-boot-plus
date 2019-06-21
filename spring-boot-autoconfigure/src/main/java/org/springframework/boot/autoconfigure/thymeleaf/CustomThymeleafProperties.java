/*
 * Copyright 2017-2019 the original author or authors.
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *     http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

package org.springframework.boot.autoconfigure.thymeleaf;

import org.springframework.boot.context.properties.ConfigurationProperties;
import org.thymeleaf.extras.minify.engine.AbstractMinifierTemplateHandler;
import org.thymeleaf.extras.minify.engine.SimpleMinifierTemplateHandler;

import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.NonNull;
import lombok.experimental.Accessors;

/**
 * Custom {@link ThymeleafProperties}
 */
@ConfigurationProperties(CustomThymeleafProperties.PREFIX)
@Data
@EqualsAndHashCode(callSuper = true)
public class CustomThymeleafProperties extends ThymeleafProperties {
	
	/**
	 * Prefix
	 */
	public static final String PREFIX = "spring.thymeleaf";
	
	/**
	 * {@link Minify}
	 */
	private Minify minify = new Minify();
	
	/**
	 * Minify
	 */
	@Data
	@Accessors(chain = true)
	public static class Minify {
		
		/**
		 * Handler class
		 */
		@NonNull
		private Class<? extends AbstractMinifierTemplateHandler> handlerClass = SimpleMinifierTemplateHandler.class;
	}
}
