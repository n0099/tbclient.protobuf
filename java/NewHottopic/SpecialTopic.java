package tbclient.NewHottopic;

import com.squareup.wire.Message;
import com.squareup.wire.ProtoField;
import java.util.Collections;
import java.util.List;
import tbclient.ThreadInfo;
/* loaded from: classes7.dex */
public final class SpecialTopic extends Message {
    public static final List<ThreadInfo> DEFAULT_THREAD_LIST = Collections.emptyList();
    public static final String DEFAULT_TITLE = "";
    @ProtoField(label = Message.Label.REPEATED, tag = 2)
    public final List<ThreadInfo> thread_list;
    @ProtoField(tag = 1, type = Message.Datatype.STRING)
    public final String title;

    private SpecialTopic(Builder builder, boolean z) {
        super(builder);
        if (z) {
            if (builder.title == null) {
                this.title = "";
            } else {
                this.title = builder.title;
            }
            if (builder.thread_list == null) {
                this.thread_list = DEFAULT_THREAD_LIST;
                return;
            } else {
                this.thread_list = immutableCopyOf(builder.thread_list);
                return;
            }
        }
        this.title = builder.title;
        this.thread_list = immutableCopyOf(builder.thread_list);
    }

    /* loaded from: classes7.dex */
    public static final class Builder extends Message.Builder<SpecialTopic> {
        public List<ThreadInfo> thread_list;
        public String title;

        public Builder() {
        }

        public Builder(SpecialTopic specialTopic) {
            super(specialTopic);
            if (specialTopic != null) {
                this.title = specialTopic.title;
                this.thread_list = SpecialTopic.copyOf(specialTopic.thread_list);
            }
        }

        /* JADX DEBUG: Method merged with bridge method */
        @Override // com.squareup.wire.Message.Builder
        public SpecialTopic build(boolean z) {
            return new SpecialTopic(this, z);
        }
    }
}
