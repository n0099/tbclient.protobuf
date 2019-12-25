package tbclient.NewHottopic;

import com.squareup.wire.Message;
import com.squareup.wire.ProtoField;
import java.util.Collections;
import java.util.List;
/* loaded from: classes6.dex */
public final class RelateThread extends Message {
    public static final Integer DEFAULT_HAS_MORE = 0;
    public static final List<TopicThread> DEFAULT_THREAD_LIST = Collections.emptyList();
    @ProtoField(tag = 1, type = Message.Datatype.INT32)
    public final Integer has_more;
    @ProtoField(label = Message.Label.REPEATED, tag = 2)
    public final List<TopicThread> thread_list;

    private RelateThread(Builder builder, boolean z) {
        super(builder);
        if (z) {
            if (builder.has_more == null) {
                this.has_more = DEFAULT_HAS_MORE;
            } else {
                this.has_more = builder.has_more;
            }
            if (builder.thread_list == null) {
                this.thread_list = DEFAULT_THREAD_LIST;
                return;
            } else {
                this.thread_list = immutableCopyOf(builder.thread_list);
                return;
            }
        }
        this.has_more = builder.has_more;
        this.thread_list = immutableCopyOf(builder.thread_list);
    }

    /* loaded from: classes6.dex */
    public static final class Builder extends Message.Builder<RelateThread> {
        public Integer has_more;
        public List<TopicThread> thread_list;

        public Builder() {
        }

        public Builder(RelateThread relateThread) {
            super(relateThread);
            if (relateThread != null) {
                this.has_more = relateThread.has_more;
                this.thread_list = RelateThread.copyOf(relateThread.thread_list);
            }
        }

        /* JADX DEBUG: Method merged with bridge method */
        @Override // com.squareup.wire.Message.Builder
        public RelateThread build(boolean z) {
            return new RelateThread(this, z);
        }
    }
}
