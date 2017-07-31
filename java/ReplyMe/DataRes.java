package tbclient.ReplyMe;

import com.squareup.wire.Message;
import com.squareup.wire.ProtoField;
import java.util.Collections;
import java.util.List;
import tbclient.Page;
/* loaded from: classes.dex */
public final class DataRes extends Message {
    public static final List<ReplyList> DEFAULT_REPLY_LIST = Collections.emptyList();
    @ProtoField(tag = 1)
    public final Page page;
    @ProtoField(label = Message.Label.REPEATED, tag = 2)
    public final List<ReplyList> reply_list;

    private DataRes(Builder builder, boolean z) {
        super(builder);
        if (z) {
            this.page = builder.page;
            if (builder.reply_list == null) {
                this.reply_list = DEFAULT_REPLY_LIST;
                return;
            } else {
                this.reply_list = immutableCopyOf(builder.reply_list);
                return;
            }
        }
        this.page = builder.page;
        this.reply_list = immutableCopyOf(builder.reply_list);
    }

    /* loaded from: classes.dex */
    public static final class Builder extends Message.Builder<DataRes> {
        public Page page;
        public List<ReplyList> reply_list;

        public Builder() {
        }

        public Builder(DataRes dataRes) {
            super(dataRes);
            if (dataRes != null) {
                this.page = dataRes.page;
                this.reply_list = DataRes.copyOf(dataRes.reply_list);
            }
        }

        /* JADX DEBUG: Method merged with bridge method */
        @Override // com.squareup.wire.Message.Builder
        public DataRes build(boolean z) {
            return new DataRes(this, z);
        }
    }
}
