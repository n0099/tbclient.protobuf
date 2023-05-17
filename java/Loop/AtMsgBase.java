package tbclient.Loop;

import com.squareup.wire.Message;
import com.squareup.wire.ProtoField;
/* loaded from: classes10.dex */
public final class AtMsgBase extends Message {
    public static final Long DEFAULT_MSG_ID = 0L;
    public static final String DEFAULT_MSG_KEY = "";
    @ProtoField(tag = 1, type = Message.Datatype.INT64)
    public final Long msg_id;
    @ProtoField(tag = 2, type = Message.Datatype.STRING)
    public final String msg_key;

    /* loaded from: classes10.dex */
    public static final class Builder extends Message.Builder<AtMsgBase> {
        public Long msg_id;
        public String msg_key;

        public Builder() {
        }

        public Builder(AtMsgBase atMsgBase) {
            super(atMsgBase);
            if (atMsgBase == null) {
                return;
            }
            this.msg_id = atMsgBase.msg_id;
            this.msg_key = atMsgBase.msg_key;
        }

        /* JADX DEBUG: Method merged with bridge method */
        @Override // com.squareup.wire.Message.Builder
        public AtMsgBase build(boolean z) {
            return new AtMsgBase(this, z);
        }
    }

    public AtMsgBase(Builder builder, boolean z) {
        super(builder);
        if (z) {
            Long l = builder.msg_id;
            if (l == null) {
                this.msg_id = DEFAULT_MSG_ID;
            } else {
                this.msg_id = l;
            }
            String str = builder.msg_key;
            if (str == null) {
                this.msg_key = "";
                return;
            } else {
                this.msg_key = str;
                return;
            }
        }
        this.msg_id = builder.msg_id;
        this.msg_key = builder.msg_key;
    }
}
