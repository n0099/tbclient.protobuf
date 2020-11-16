package tbclient;

import com.squareup.wire.Message;
import com.squareup.wire.ProtoField;
import java.util.Collections;
import java.util.List;
/* loaded from: classes21.dex */
public final class RedpacketRain extends Message {
    public static final String DEFAULT_ACTIVITY_ID = "";
    public static final String DEFAULT_FLOAT_URL = "";
    public static final String DEFAULT_JUMP_URL = "";
    @ProtoField(tag = 6, type = Message.Datatype.STRING)
    public final String activity_id;
    @ProtoField(label = Message.Label.REPEATED, tag = 5, type = Message.Datatype.STRING)
    public final List<String> dynamic_img;
    @ProtoField(tag = 2, type = Message.Datatype.UINT64)
    public final Long end_time;
    @ProtoField(tag = 4, type = Message.Datatype.STRING)
    public final String float_url;
    @ProtoField(tag = 3, type = Message.Datatype.STRING)
    public final String jump_url;
    @ProtoField(tag = 7, type = Message.Datatype.INT32)
    public final Integer show_type;
    @ProtoField(tag = 1, type = Message.Datatype.UINT64)
    public final Long start_time;
    public static final Long DEFAULT_START_TIME = 0L;
    public static final Long DEFAULT_END_TIME = 0L;
    public static final List<String> DEFAULT_DYNAMIC_IMG = Collections.emptyList();
    public static final Integer DEFAULT_SHOW_TYPE = 0;

    private RedpacketRain(Builder builder, boolean z) {
        super(builder);
        if (z) {
            if (builder.start_time == null) {
                this.start_time = DEFAULT_START_TIME;
            } else {
                this.start_time = builder.start_time;
            }
            if (builder.end_time == null) {
                this.end_time = DEFAULT_END_TIME;
            } else {
                this.end_time = builder.end_time;
            }
            if (builder.jump_url == null) {
                this.jump_url = "";
            } else {
                this.jump_url = builder.jump_url;
            }
            if (builder.float_url == null) {
                this.float_url = "";
            } else {
                this.float_url = builder.float_url;
            }
            if (builder.dynamic_img == null) {
                this.dynamic_img = DEFAULT_DYNAMIC_IMG;
            } else {
                this.dynamic_img = immutableCopyOf(builder.dynamic_img);
            }
            if (builder.activity_id == null) {
                this.activity_id = "";
            } else {
                this.activity_id = builder.activity_id;
            }
            if (builder.show_type == null) {
                this.show_type = DEFAULT_SHOW_TYPE;
                return;
            } else {
                this.show_type = builder.show_type;
                return;
            }
        }
        this.start_time = builder.start_time;
        this.end_time = builder.end_time;
        this.jump_url = builder.jump_url;
        this.float_url = builder.float_url;
        this.dynamic_img = immutableCopyOf(builder.dynamic_img);
        this.activity_id = builder.activity_id;
        this.show_type = builder.show_type;
    }

    /* loaded from: classes21.dex */
    public static final class Builder extends Message.Builder<RedpacketRain> {
        public String activity_id;
        public List<String> dynamic_img;
        public Long end_time;
        public String float_url;
        public String jump_url;
        public Integer show_type;
        public Long start_time;

        public Builder() {
        }

        public Builder(RedpacketRain redpacketRain) {
            super(redpacketRain);
            if (redpacketRain != null) {
                this.start_time = redpacketRain.start_time;
                this.end_time = redpacketRain.end_time;
                this.jump_url = redpacketRain.jump_url;
                this.float_url = redpacketRain.float_url;
                this.dynamic_img = RedpacketRain.copyOf(redpacketRain.dynamic_img);
                this.activity_id = redpacketRain.activity_id;
                this.show_type = redpacketRain.show_type;
            }
        }

        /* JADX DEBUG: Method merged with bridge method */
        @Override // com.squareup.wire.Message.Builder
        public RedpacketRain build(boolean z) {
            return new RedpacketRain(this, z);
        }
    }
}
