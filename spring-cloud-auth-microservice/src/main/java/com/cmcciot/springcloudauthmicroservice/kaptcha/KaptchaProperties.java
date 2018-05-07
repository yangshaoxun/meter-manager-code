package com.cmcciot.springcloudauthmicroservice.kaptcha;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.autoconfigure.condition.ConditionalOnProperty;
import org.springframework.context.annotation.Configuration;

import lombok.Data;

/**
 * 验证码的配置文件，主要配置宽，高，字体等
 * @author yangshaoxun
 *
 */
@Data
@Configuration
@ConditionalOnProperty(prefix = "kaptcha", value = "enabled", havingValue = "true")
public class KaptchaProperties {

	// 是否加粗
	@Value("${kaptcha.border}")
	private String border;

	// 字体颜色
	@Value("${kaptcha.textproducer.font.color}")
	private String fontColor;

	// 字号
	@Value("${kaptcha.textproducer.font.size}")
	private String fontSzie;

	// 字体
	@Value("${kaptcha.textproducer.font.names}")
	private String fontNames;

	// 图片宽度
	@Value("${kaptcha.image.width}")
	private String width;

	// 图片高度
	@Value("${kaptcha.image.height}")
	private String height;

	// 字符长度,默认为4个
	@Value("${kaptcha.textproducer.char.length:4}")
	private String charLength;

	// 输入的字符
	@Value("${kaptcha.textproducer.char.string}")
	private String charString;

	// 字间距
	@Value("${kaptcha.textproducer.char.space}")
	private String charSpace;
}
