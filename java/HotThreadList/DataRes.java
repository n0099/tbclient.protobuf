package tbclient.HotThreadList;

import com.squareup.wire.Message;
import com.squareup.wire.ProtoField;
import java.util.Collections;
import java.util.List;
import tbclient.FrsTabInfo;
import tbclient.RecomTopicList;
import tbclient.ThreadInfo;
/* loaded from: classes10.dex */
public final class DataRes extends Message {
    @ProtoField(label = Message.Label.REPEATED, tag = 3)
    public final List<FrsTabInfo> hot_thread_tab_info;
    @ProtoField(label = Message.Label.REPEATED, tag = 4)
    public final List<InnerTabInfo> inner_tabs;
    @ProtoField(label = Message.Label.REPEATED, tag = 2)
    public final List<ThreadInfo> thread_info;
    @ProtoField(label = Message.Label.REPEATED, tag = 1)
    public final List<RecomTopicList> topic_list;
    public static final List<RecomTopicList> DEFAULT_TOPIC_LIST = Collections.emptyList();
    public static final List<ThreadInfo> DEFAULT_THREAD_INFO = Collections.emptyList();
    public static final List<FrsTabInfo> DEFAULT_HOT_THREAD_TAB_INFO = Collections.emptyList();
    public static final List<InnerTabInfo> DEFAULT_INNER_TABS = Collections.emptyList();

    /* loaded from: classes10.dex */
    public static final class Builder extends Message.Builder<DataRes> {
        public List<FrsTabInfo> hot_thread_tab_info;
        public List<InnerTabInfo> inner_tabs;
        public List<ThreadInfo> thread_info;
        public List<RecomTopicList> topic_list;

        public Builder() {
        }

        public Builder(DataRes dataRes) {
            super(dataRes);
            if (dataRes == null) {
                return;
            }
            this.topic_list = Message.copyOf(dataRes.topic_list);
            this.thread_info = Message.copyOf(dataRes.thread_info);
            this.hot_thread_tab_info = Message.copyOf(dataRes.hot_thread_tab_info);
            this.inner_tabs = Message.copyOf(dataRes.inner_tabs);
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
            List<RecomTopicList> list = builder.topic_list;
            if (list == null) {
                this.topic_list = DEFAULT_TOPIC_LIST;
            } else {
                this.topic_list = Message.immutableCopyOf(list);
            }
            List<ThreadInfo> list2 = builder.thread_info;
            if (list2 == null) {
                this.thread_info = DEFAULT_THREAD_INFO;
            } else {
                this.thread_info = Message.immutableCopyOf(list2);
            }
            List<FrsTabInfo> list3 = builder.hot_thread_tab_info;
            if (list3 == null) {
                this.hot_thread_tab_info = DEFAULT_HOT_THREAD_TAB_INFO;
            } else {
                this.hot_thread_tab_info = Message.immutableCopyOf(list3);
            }
            List<InnerTabInfo> list4 = builder.inner_tabs;
            if (list4 == null) {
                this.inner_tabs = DEFAULT_INNER_TABS;
                return;
            } else {
                this.inner_tabs = Message.immutableCopyOf(list4);
                return;
            }
        }
        this.topic_list = Message.immutableCopyOf(builder.topic_list);
        this.thread_info = Message.immutableCopyOf(builder.thread_info);
        this.hot_thread_tab_info = Message.immutableCopyOf(builder.hot_thread_tab_info);
        this.inner_tabs = Message.immutableCopyOf(builder.inner_tabs);
    }
}
