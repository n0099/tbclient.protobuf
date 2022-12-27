package tbclient.ReplyMe;

import com.squareup.wire.Message;
import com.squareup.wire.ProtoField;
import java.util.Collections;
import java.util.List;
import tbclient.Page;
/* loaded from: classes9.dex */
public final class DataRes extends Message {
    public static final List<ReplyList> DEFAULT_REPLY_LIST = Collections.emptyList();
    @ProtoField(tag = 1)
    public final Page page;
    @ProtoField(label = Message.Label.REPEATED, tag = 2)
    public final List<ReplyList> reply_list;

    /* loaded from: classes9.dex */
    public static final class Builder extends Message.Builder<DataRes> {
        public Page page;
        public List<ReplyList> reply_list;

        public Builder() {
        }

        public Builder(DataRes dataRes) {
            super(dataRes);
            if (dataRes == null) {
                return;
            }
            this.page = dataRes.page;
            this.reply_list = Message.copyOf(dataRes.reply_list);
        }

        /* JADX DEBUG: Method merged with bridge method */
        @Override // com.squareup.wire.Message.Builder
        public DataRes build(boolean z) {
            return new DataRes(this, z);
        }
    }

    public DataRes(Builder builder, boolean z) {
        super(builder);
        if (z) {
            this.page = builder.page;
            List<ReplyList> list = builder.reply_list;
            if (list == null) {
                this.reply_list = DEFAULT_REPLY_LIST;
                return;
            } else {
                this.reply_list = Message.immutableCopyOf(list);
                return;
            }
        }
        this.page = builder.page;
        this.reply_list = Message.immutableCopyOf(builder.reply_list);
    }
}
