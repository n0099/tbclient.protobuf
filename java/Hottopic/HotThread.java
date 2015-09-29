package tbclient.Hottopic;

import com.squareup.wire.Message;
import com.squareup.wire.ProtoField;
import java.util.Collections;
import java.util.List;
import tbclient.Page;
import tbclient.ThreadInfo;
/* loaded from: classes.dex */
public final class HotThread extends Message {
    public static final String DEFAULT_HOT_TITLE = "";
    public static final List<ThreadInfo> DEFAULT_THREAD_LIST = Collections.emptyList();
    @ProtoField(tag = 1, type = Message.Datatype.STRING)
    public final String hot_title;
    @ProtoField(tag = 3)
    public final Page page;
    @ProtoField(label = Message.Label.REPEATED, tag = 2)
    public final List<ThreadInfo> thread_list;

    /* synthetic */ HotThread(Builder builder, boolean z, HotThread hotThread) {
        this(builder, z);
    }

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
            return;
        }
        this.hot_title = builder.hot_title;
        this.thread_list = immutableCopyOf(builder.thread_list);
        this.page = builder.page;
    }

    /* loaded from: classes.dex */
    public static final class Builder extends Message.Builder<HotThread> {
        public String hot_title;
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
            }
        }

        /* JADX DEBUG: Method merged with bridge method */
        @Override // com.squareup.wire.Message.Builder
        public HotThread build(boolean z) {
            return new HotThread(this, z, null);
        }
    }
}
