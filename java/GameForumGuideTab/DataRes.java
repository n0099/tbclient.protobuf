package tbclient.GameForumGuideTab;

import com.squareup.wire.Message;
import com.squareup.wire.ProtoField;
import java.util.Collections;
import java.util.List;
import tbclient.ThreadInfo;
/* loaded from: classes10.dex */
public final class DataRes extends Message {
    @ProtoField(tag = 3, type = Message.Datatype.INT32)
    public final Integer has_more;
    @ProtoField(label = Message.Label.REPEATED, tag = 1)
    public final List<GameForumSubTab> sub_tab_list;
    @ProtoField(label = Message.Label.REPEATED, tag = 2)
    public final List<ThreadInfo> thread_list;
    public static final List<GameForumSubTab> DEFAULT_SUB_TAB_LIST = Collections.emptyList();
    public static final List<ThreadInfo> DEFAULT_THREAD_LIST = Collections.emptyList();
    public static final Integer DEFAULT_HAS_MORE = 0;

    /* loaded from: classes10.dex */
    public static final class Builder extends Message.Builder<DataRes> {
        public Integer has_more;
        public List<GameForumSubTab> sub_tab_list;
        public List<ThreadInfo> thread_list;

        public Builder() {
        }

        public Builder(DataRes dataRes) {
            super(dataRes);
            if (dataRes == null) {
                return;
            }
            this.sub_tab_list = Message.copyOf(dataRes.sub_tab_list);
            this.thread_list = Message.copyOf(dataRes.thread_list);
            this.has_more = dataRes.has_more;
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
            List<GameForumSubTab> list = builder.sub_tab_list;
            if (list == null) {
                this.sub_tab_list = DEFAULT_SUB_TAB_LIST;
            } else {
                this.sub_tab_list = Message.immutableCopyOf(list);
            }
            List<ThreadInfo> list2 = builder.thread_list;
            if (list2 == null) {
                this.thread_list = DEFAULT_THREAD_LIST;
            } else {
                this.thread_list = Message.immutableCopyOf(list2);
            }
            Integer num = builder.has_more;
            if (num == null) {
                this.has_more = DEFAULT_HAS_MORE;
                return;
            } else {
                this.has_more = num;
                return;
            }
        }
        this.sub_tab_list = Message.immutableCopyOf(builder.sub_tab_list);
        this.thread_list = Message.immutableCopyOf(builder.thread_list);
        this.has_more = builder.has_more;
    }
}
