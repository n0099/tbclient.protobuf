package tbclient.Hottopic;

import com.squareup.wire.Message;
import com.squareup.wire.ProtoField;
import java.util.Collections;
import java.util.List;
import tbclient.ThreadInfo;
/* loaded from: classes8.dex */
public final class SpecialTopic extends Message {
    public static final List<ThreadInfo> DEFAULT_THREAD_LIST = Collections.emptyList();
    public static final String DEFAULT_TITLE = "";
    @ProtoField(label = Message.Label.REPEATED, tag = 2)
    public final List<ThreadInfo> thread_list;
    @ProtoField(tag = 1, type = Message.Datatype.STRING)
    public final String title;

    /* loaded from: classes8.dex */
    public static final class Builder extends Message.Builder<SpecialTopic> {
        public List<ThreadInfo> thread_list;
        public String title;

        public Builder() {
        }

        public Builder(SpecialTopic specialTopic) {
            super(specialTopic);
            if (specialTopic == null) {
                return;
            }
            this.title = specialTopic.title;
            this.thread_list = Message.copyOf(specialTopic.thread_list);
        }

        /* JADX DEBUG: Method merged with bridge method */
        @Override // com.squareup.wire.Message.Builder
        public SpecialTopic build(boolean z) {
            return new SpecialTopic(this, z);
        }
    }

    public SpecialTopic(Builder builder, boolean z) {
        super(builder);
        if (z) {
            String str = builder.title;
            if (str == null) {
                this.title = "";
            } else {
                this.title = str;
            }
            List<ThreadInfo> list = builder.thread_list;
            if (list == null) {
                this.thread_list = DEFAULT_THREAD_LIST;
                return;
            } else {
                this.thread_list = Message.immutableCopyOf(list);
                return;
            }
        }
        this.title = builder.title;
        this.thread_list = Message.immutableCopyOf(builder.thread_list);
    }
}
