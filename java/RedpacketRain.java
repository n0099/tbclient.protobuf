package tbclient;

import com.squareup.wire.Message;
import com.squareup.wire.ProtoField;
import java.util.Collections;
import java.util.List;
/* loaded from: classes8.dex */
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

    /* loaded from: classes8.dex */
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
            if (redpacketRain == null) {
                return;
            }
            this.start_time = redpacketRain.start_time;
            this.end_time = redpacketRain.end_time;
            this.jump_url = redpacketRain.jump_url;
            this.float_url = redpacketRain.float_url;
            this.dynamic_img = Message.copyOf(redpacketRain.dynamic_img);
            this.activity_id = redpacketRain.activity_id;
            this.show_type = redpacketRain.show_type;
        }

        /* JADX DEBUG: Method merged with bridge method */
        @Override // com.squareup.wire.Message.Builder
        public RedpacketRain build(boolean z) {
            return new RedpacketRain(this, z);
        }
    }

    public RedpacketRain(Builder builder, boolean z) {
        super(builder);
        if (z) {
            Long l = builder.start_time;
            if (l == null) {
                this.start_time = DEFAULT_START_TIME;
            } else {
                this.start_time = l;
            }
            Long l2 = builder.end_time;
            if (l2 == null) {
                this.end_time = DEFAULT_END_TIME;
            } else {
                this.end_time = l2;
            }
            String str = builder.jump_url;
            if (str == null) {
                this.jump_url = "";
            } else {
                this.jump_url = str;
            }
            String str2 = builder.float_url;
            if (str2 == null) {
                this.float_url = "";
            } else {
                this.float_url = str2;
            }
            List<String> list = builder.dynamic_img;
            if (list == null) {
                this.dynamic_img = DEFAULT_DYNAMIC_IMG;
            } else {
                this.dynamic_img = Message.immutableCopyOf(list);
            }
            String str3 = builder.activity_id;
            if (str3 == null) {
                this.activity_id = "";
            } else {
                this.activity_id = str3;
            }
            Integer num = builder.show_type;
            if (num == null) {
                this.show_type = DEFAULT_SHOW_TYPE;
                return;
            } else {
                this.show_type = num;
                return;
            }
        }
        this.start_time = builder.start_time;
        this.end_time = builder.end_time;
        this.jump_url = builder.jump_url;
        this.float_url = builder.float_url;
        this.dynamic_img = Message.immutableCopyOf(builder.dynamic_img);
        this.activity_id = builder.activity_id;
        this.show_type = builder.show_type;
    }
}
