package tbclient;

import com.squareup.wire.Message;
import com.squareup.wire.ProtoField;
/* loaded from: classes21.dex */
public final class DynamicInfo extends Message {
    public static final String DEFAULT_IS_HIDE = "";
    @ProtoField(tag = 2, type = Message.Datatype.INT64)
    public final Long dynamic_timestamp;
    @ProtoField(tag = 3)
    public final ForumDynamic forum_dynamic;
    @ProtoField(tag = 6, type = Message.Datatype.STRING)
    public final String is_hide;
    @ProtoField(tag = 1)
    public final ThreadInfo thread_dynamic;
    @ProtoField(tag = 5, type = Message.Datatype.INT32)
    public final Integer type;
    @ProtoField(tag = 4)
    public final UserDynamic user_dynamic;
    public static final Long DEFAULT_DYNAMIC_TIMESTAMP = 0L;
    public static final Integer DEFAULT_TYPE = 0;

    private DynamicInfo(Builder builder, boolean z) {
        super(builder);
        if (z) {
            this.thread_dynamic = builder.thread_dynamic;
            if (builder.dynamic_timestamp == null) {
                this.dynamic_timestamp = DEFAULT_DYNAMIC_TIMESTAMP;
            } else {
                this.dynamic_timestamp = builder.dynamic_timestamp;
            }
            this.forum_dynamic = builder.forum_dynamic;
            this.user_dynamic = builder.user_dynamic;
            if (builder.type == null) {
                this.type = DEFAULT_TYPE;
            } else {
                this.type = builder.type;
            }
            if (builder.is_hide == null) {
                this.is_hide = "";
                return;
            } else {
                this.is_hide = builder.is_hide;
                return;
            }
        }
        this.thread_dynamic = builder.thread_dynamic;
        this.dynamic_timestamp = builder.dynamic_timestamp;
        this.forum_dynamic = builder.forum_dynamic;
        this.user_dynamic = builder.user_dynamic;
        this.type = builder.type;
        this.is_hide = builder.is_hide;
    }

    /* loaded from: classes21.dex */
    public static final class Builder extends Message.Builder<DynamicInfo> {
        public Long dynamic_timestamp;
        public ForumDynamic forum_dynamic;
        public String is_hide;
        public ThreadInfo thread_dynamic;
        public Integer type;
        public UserDynamic user_dynamic;

        public Builder() {
        }

        public Builder(DynamicInfo dynamicInfo) {
            super(dynamicInfo);
            if (dynamicInfo != null) {
                this.thread_dynamic = dynamicInfo.thread_dynamic;
                this.dynamic_timestamp = dynamicInfo.dynamic_timestamp;
                this.forum_dynamic = dynamicInfo.forum_dynamic;
                this.user_dynamic = dynamicInfo.user_dynamic;
                this.type = dynamicInfo.type;
                this.is_hide = dynamicInfo.is_hide;
            }
        }

        /* JADX DEBUG: Method merged with bridge method */
        @Override // com.squareup.wire.Message.Builder
        public DynamicInfo build(boolean z) {
            return new DynamicInfo(this, z);
        }
    }
}
