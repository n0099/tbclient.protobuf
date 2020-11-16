package tbclient.GetMoreMsg;

import com.squareup.wire.Message;
import com.squareup.wire.ProtoField;
import java.util.Collections;
import java.util.List;
/* loaded from: classes20.dex */
public final class DataRes extends Message {
    @ProtoField(tag = 2, type = Message.Datatype.INT32)
    public final Integer has_more;
    @ProtoField(label = Message.Label.REPEATED, tag = 1)
    public final List<MsgContent> msg_content;
    public static final List<MsgContent> DEFAULT_MSG_CONTENT = Collections.emptyList();
    public static final Integer DEFAULT_HAS_MORE = 0;

    private DataRes(Builder builder, boolean z) {
        super(builder);
        if (z) {
            if (builder.msg_content == null) {
                this.msg_content = DEFAULT_MSG_CONTENT;
            } else {
                this.msg_content = immutableCopyOf(builder.msg_content);
            }
            if (builder.has_more == null) {
                this.has_more = DEFAULT_HAS_MORE;
                return;
            } else {
                this.has_more = builder.has_more;
                return;
            }
        }
        this.msg_content = immutableCopyOf(builder.msg_content);
        this.has_more = builder.has_more;
    }

    /* loaded from: classes20.dex */
    public static final class Builder extends Message.Builder<DataRes> {
        public Integer has_more;
        public List<MsgContent> msg_content;

        public Builder() {
        }

        public Builder(DataRes dataRes) {
            super(dataRes);
            if (dataRes != null) {
                this.msg_content = DataRes.copyOf(dataRes.msg_content);
                this.has_more = dataRes.has_more;
            }
        }

        /* JADX DEBUG: Method merged with bridge method */
        @Override // com.squareup.wire.Message.Builder
        public DataRes build(boolean z) {
            return new DataRes(this, z);
        }
    }
}
