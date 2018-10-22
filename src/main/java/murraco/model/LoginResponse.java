package murraco.model;

import java.time.Duration;
import java.util.Calendar;
import java.util.Date;

import org.springframework.data.annotation.Id;
import org.springframework.data.redis.core.RedisHash;
import org.springframework.data.redis.core.TimeToLive;

import com.fasterxml.jackson.annotation.JsonIgnore;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
@RedisHash("LoginResponse")
public class LoginResponse {

	private String jws;

	public LoginResponse(String jws) {
		super();
		this.jws = jws;
	}

	@Id
	@JsonIgnore
	private transient String userName;

	@TimeToLive
	public Long timeToLive() {
		Calendar c = Calendar.getInstance();
		c.add(Calendar.DAY_OF_MONTH, 1);
		c.set(Calendar.HOUR_OF_DAY, 0);
		c.set(Calendar.MINUTE, 0);
		c.set(Calendar.SECOND, 0);
		c.set(Calendar.MILLISECOND, 0);
		long howMany = (c.getTimeInMillis() - System.currentTimeMillis());
		return howMany / 1000;
	}

}
