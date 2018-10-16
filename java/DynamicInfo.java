package tbclient;

import com.squareup.wire.Message;
import com.squareup.wire.ProtoField;
/* loaded from: classes4.dex */
public final class DynamicInfo extends Message {
    public static final Long DEFAULT_DYNAMIC_TIMESTAMP = 0L;
    public static final Integer DEFAULT_TYPE = 0;
    @ProtoField(tag = 2, type = Message.Datatype.INT64)
    public final Long dynamic_timestamp;
    @ProtoField(tag = 3)
    public final ForumDynamic forum_dynamic;
    @ProtoField(tag = 1)
    public final ThreadInfo thread_dynamic;
    @ProtoField(tag = 5, type = Message.Datatype.INT32)
    public final Integer type;
    @ProtoField(tag = 4)
    public final UserDynamic user_dynamic;

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
                return;
            } else {
                this.type = builder.type;
                return;
            }
        }
        this.thread_dynamic = builder.thread_dynamic;
        this.dynamic_timestamp = builder.dynamic_timestamp;
        this.forum_dynamic = builder.forum_dynamic;
        this.user_dynamic = builder.user_dynamic;
        this.type = builder.type;
    }

    /* loaded from: classes4.dex */
    public static final class Builder extends Message.Builder<DynamicInfo> {
        public Long dynamic_timestamp;
        public ForumDynamic forum_dynamic;
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
            }
        }

        /* JADX DEBUG: Method merged with bridge method */
        @Override // com.squareup.wire.Message.Builder
        public DynamicInfo build(boolean z) {
            return new DynamicInfo(this, z);
        }
    }
}
