package tbclient;

import com.squareup.wire.Message;
import com.squareup.wire.ProtoField;
/* loaded from: classes.dex */
public final class CallFansInfo extends Message {
    public static final Integer DEFAULT_CAN_CALL = 0;
    public static final Long DEFAULT_THREAD_ID = 0L;
    @ProtoField(tag = 1, type = Message.Datatype.INT32)
    public final Integer can_call;
    @ProtoField(tag = 2, type = Message.Datatype.INT64)
    public final Long thread_id;

    /* loaded from: classes7.dex */
    public static final class Builder extends Message.Builder<CallFansInfo> {
        public Integer can_call;
        public Long thread_id;

        public Builder() {
        }

        public Builder(CallFansInfo callFansInfo) {
            super(callFansInfo);
            if (callFansInfo == null) {
                return;
            }
            this.can_call = callFansInfo.can_call;
            this.thread_id = callFansInfo.thread_id;
        }

        /* JADX DEBUG: Method merged with bridge method */
        @Override // com.squareup.wire.Message.Builder
        public CallFansInfo build(boolean z) {
            return new CallFansInfo(this, z);
        }
    }

    public CallFansInfo(Builder builder, boolean z) {
        super(builder);
        if (z) {
            Integer num = builder.can_call;
            if (num == null) {
                this.can_call = DEFAULT_CAN_CALL;
            } else {
                this.can_call = num;
            }
            Long l = builder.thread_id;
            if (l == null) {
                this.thread_id = DEFAULT_THREAD_ID;
                return;
            } else {
                this.thread_id = l;
                return;
            }
        }
        this.can_call = builder.can_call;
        this.thread_id = builder.thread_id;
    }
}
