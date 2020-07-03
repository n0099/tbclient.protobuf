package tbclient.Hottopic;

import com.squareup.wire.Message;
import com.squareup.wire.ProtoField;
import java.util.Collections;
import java.util.List;
import tbclient.Page;
import tbclient.ThreadInfo;
/* loaded from: classes8.dex */
public final class HotThread extends Message {
    public static final String DEFAULT_HOT_TITLE = "";
    @ProtoField(tag = 1, type = Message.Datatype.STRING)
    public final String hot_title;
    @ProtoField(tag = 4, type = Message.Datatype.INT32)
    public final Integer is_new_url;
    @ProtoField(tag = 3)
    public final Page page;
    @ProtoField(label = Message.Label.REPEATED, tag = 2)
    public final List<ThreadInfo> thread_list;
    public static final List<ThreadInfo> DEFAULT_THREAD_LIST = Collections.emptyList();
    public static final Integer DEFAULT_IS_NEW_URL = 0;

    private HotThread(Builder builder, boolean z) {
        super(builder);
        if (z) {
            if (builder.hot_title == null) {
                this.hot_title = "";
            } else {
                this.hot_title = builder.hot_title;
            }
            if (builder.thread_list == null) {
                this.thread_list = DEFAULT_THREAD_LIST;
            } else {
                this.thread_list = immutableCopyOf(builder.thread_list);
            }
            this.page = builder.page;
            if (builder.is_new_url == null) {
                this.is_new_url = DEFAULT_IS_NEW_URL;
                return;
            } else {
                this.is_new_url = builder.is_new_url;
                return;
            }
        }
        this.hot_title = builder.hot_title;
        this.thread_list = immutableCopyOf(builder.thread_list);
        this.page = builder.page;
        this.is_new_url = builder.is_new_url;
    }

    /* loaded from: classes8.dex */
    public static final class Builder extends Message.Builder<HotThread> {
        public String hot_title;
        public Integer is_new_url;
        public Page page;
        public List<ThreadInfo> thread_list;

        public Builder() {
        }

        public Builder(HotThread hotThread) {
            super(hotThread);
            if (hotThread != null) {
                this.hot_title = hotThread.hot_title;
                this.thread_list = HotThread.copyOf(hotThread.thread_list);
                this.page = hotThread.page;
                this.is_new_url = hotThread.is_new_url;
            }
        }

        /* JADX DEBUG: Method merged with bridge method */
        @Override // com.squareup.wire.Message.Builder
        public HotThread build(boolean z) {
            return new HotThread(this, z);
        }
    }
}
