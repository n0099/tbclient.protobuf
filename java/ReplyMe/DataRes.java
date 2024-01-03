package tbclient.ReplyMe;

import com.squareup.wire.Message;
import com.squareup.wire.ProtoField;
import java.util.Collections;
import java.util.List;
import tbclient.ChooseThreadList;
import tbclient.ChooseTimeList;
import tbclient.Page;
/* loaded from: classes2.dex */
public final class DataRes extends Message {
    @ProtoField(label = Message.Label.REPEATED, tag = 3)
    public final List<ChooseThreadList> choose_thread_list;
    @ProtoField(label = Message.Label.REPEATED, tag = 4)
    public final List<ChooseTimeList> choose_time_list;
    @ProtoField(tag = 1)
    public final Page page;
    @ProtoField(label = Message.Label.REPEATED, tag = 2)
    public final List<ReplyList> reply_list;
    public static final List<ReplyList> DEFAULT_REPLY_LIST = Collections.emptyList();
    public static final List<ChooseThreadList> DEFAULT_CHOOSE_THREAD_LIST = Collections.emptyList();
    public static final List<ChooseTimeList> DEFAULT_CHOOSE_TIME_LIST = Collections.emptyList();

    /* loaded from: classes2.dex */
    public static final class Builder extends Message.Builder<DataRes> {
        public List<ChooseThreadList> choose_thread_list;
        public List<ChooseTimeList> choose_time_list;
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
            this.choose_thread_list = Message.copyOf(dataRes.choose_thread_list);
            this.choose_time_list = Message.copyOf(dataRes.choose_time_list);
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
            } else {
                this.reply_list = Message.immutableCopyOf(list);
            }
            List<ChooseThreadList> list2 = builder.choose_thread_list;
            if (list2 == null) {
                this.choose_thread_list = DEFAULT_CHOOSE_THREAD_LIST;
            } else {
                this.choose_thread_list = Message.immutableCopyOf(list2);
            }
            List<ChooseTimeList> list3 = builder.choose_time_list;
            if (list3 == null) {
                this.choose_time_list = DEFAULT_CHOOSE_TIME_LIST;
                return;
            } else {
                this.choose_time_list = Message.immutableCopyOf(list3);
                return;
            }
        }
        this.page = builder.page;
        this.reply_list = Message.immutableCopyOf(builder.reply_list);
        this.choose_thread_list = Message.immutableCopyOf(builder.choose_thread_list);
        this.choose_time_list = Message.immutableCopyOf(builder.choose_time_list);
    }
}
