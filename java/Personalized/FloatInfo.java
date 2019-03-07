package tbclient.Personalized;

import com.squareup.wire.Message;
import com.squareup.wire.ProtoField;
import java.util.Collections;
import java.util.List;
/* loaded from: classes4.dex */
public final class FloatInfo extends Message {
    public static final String DEFAULT_FLOAT_URL = "";
    public static final String DEFAULT_JUMP_URL = "";
    @ProtoField(tag = 5, type = Message.Datatype.UINT64)
    public final Long activity_id;
    @ProtoField(label = Message.Label.REPEATED, tag = 4, type = Message.Datatype.STRING)
    public final List<String> dynamic_url;
    @ProtoField(tag = 3, type = Message.Datatype.UINT64)
    public final Long end_time;
    @ProtoField(tag = 1, type = Message.Datatype.STRING)
    public final String float_url;
    @ProtoField(tag = 6, type = Message.Datatype.STRING)
    public final String jump_url;
    @ProtoField(tag = 7, type = Message.Datatype.UINT32)
    public final Integer show_type;
    @ProtoField(tag = 2, type = Message.Datatype.UINT64)
    public final Long start_time;
    public static final Long DEFAULT_START_TIME = 0L;
    public static final Long DEFAULT_END_TIME = 0L;
    public static final List<String> DEFAULT_DYNAMIC_URL = Collections.emptyList();
    public static final Long DEFAULT_ACTIVITY_ID = 0L;
    public static final Integer DEFAULT_SHOW_TYPE = 0;

    private FloatInfo(Builder builder, boolean z) {
        super(builder);
        if (z) {
            if (builder.float_url == null) {
                this.float_url = "";
            } else {
                this.float_url = builder.float_url;
            }
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
            if (builder.dynamic_url == null) {
                this.dynamic_url = DEFAULT_DYNAMIC_URL;
            } else {
                this.dynamic_url = immutableCopyOf(builder.dynamic_url);
            }
            if (builder.activity_id == null) {
                this.activity_id = DEFAULT_ACTIVITY_ID;
            } else {
                this.activity_id = builder.activity_id;
            }
            if (builder.jump_url == null) {
                this.jump_url = "";
            } else {
                this.jump_url = builder.jump_url;
            }
            if (builder.show_type == null) {
                this.show_type = DEFAULT_SHOW_TYPE;
                return;
            } else {
                this.show_type = builder.show_type;
                return;
            }
        }
        this.float_url = builder.float_url;
        this.start_time = builder.start_time;
        this.end_time = builder.end_time;
        this.dynamic_url = immutableCopyOf(builder.dynamic_url);
        this.activity_id = builder.activity_id;
        this.jump_url = builder.jump_url;
        this.show_type = builder.show_type;
    }

    /* loaded from: classes4.dex */
    public static final class Builder extends Message.Builder<FloatInfo> {
        public Long activity_id;
        public List<String> dynamic_url;
        public Long end_time;
        public String float_url;
        public String jump_url;
        public Integer show_type;
        public Long start_time;

        public Builder() {
        }

        public Builder(FloatInfo floatInfo) {
            super(floatInfo);
            if (floatInfo != null) {
                this.float_url = floatInfo.float_url;
                this.start_time = floatInfo.start_time;
                this.end_time = floatInfo.end_time;
                this.dynamic_url = FloatInfo.copyOf(floatInfo.dynamic_url);
                this.activity_id = floatInfo.activity_id;
                this.jump_url = floatInfo.jump_url;
                this.show_type = floatInfo.show_type;
            }
        }

        /* JADX DEBUG: Method merged with bridge method */
        @Override // com.squareup.wire.Message.Builder
        public FloatInfo build(boolean z) {
            return new FloatInfo(this, z);
        }
    }
}
