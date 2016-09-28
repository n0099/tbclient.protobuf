package tbclient.Personalized;

import com.squareup.wire.Message;
import com.squareup.wire.ProtoField;
import java.util.Collections;
import java.util.List;
/* loaded from: classes.dex */
public final class ThreadPersonalized extends Message {
    public static final String DEFAULT_ABTEST_TAG = "";
    public static final String DEFAULT_SOURCE = "";
    public static final String DEFAULT_WEIGHT = "";
    @ProtoField(tag = 4, type = Message.Datatype.STRING)
    public final String abtest_tag;
    @ProtoField(label = Message.Label.REPEATED, tag = 5)
    public final List<DislikeReason> dislike_resource;
    @ProtoField(tag = 3, type = Message.Datatype.STRING)
    public final String source;
    @ProtoField(tag = 1, type = Message.Datatype.UINT64)
    public final Long tid;
    @ProtoField(tag = 2, type = Message.Datatype.STRING)
    public final String weight;
    public static final Long DEFAULT_TID = 0L;
    public static final List<DislikeReason> DEFAULT_DISLIKE_RESOURCE = Collections.emptyList();

    /* synthetic */ ThreadPersonalized(Builder builder, boolean z, ThreadPersonalized threadPersonalized) {
        this(builder, z);
    }

    private ThreadPersonalized(Builder builder, boolean z) {
        super(builder);
        if (z) {
            if (builder.tid == null) {
                this.tid = DEFAULT_TID;
            } else {
                this.tid = builder.tid;
            }
            if (builder.weight == null) {
                this.weight = "";
            } else {
                this.weight = builder.weight;
            }
            if (builder.source == null) {
                this.source = "";
            } else {
                this.source = builder.source;
            }
            if (builder.abtest_tag == null) {
                this.abtest_tag = "";
            } else {
                this.abtest_tag = builder.abtest_tag;
            }
            if (builder.dislike_resource == null) {
                this.dislike_resource = DEFAULT_DISLIKE_RESOURCE;
                return;
            } else {
                this.dislike_resource = immutableCopyOf(builder.dislike_resource);
                return;
            }
        }
        this.tid = builder.tid;
        this.weight = builder.weight;
        this.source = builder.source;
        this.abtest_tag = builder.abtest_tag;
        this.dislike_resource = immutableCopyOf(builder.dislike_resource);
    }

    /* loaded from: classes.dex */
    public static final class Builder extends Message.Builder<ThreadPersonalized> {
        public String abtest_tag;
        public List<DislikeReason> dislike_resource;
        public String source;
        public Long tid;
        public String weight;

        public Builder() {
        }

        public Builder(ThreadPersonalized threadPersonalized) {
            super(threadPersonalized);
            if (threadPersonalized != null) {
                this.tid = threadPersonalized.tid;
                this.weight = threadPersonalized.weight;
                this.source = threadPersonalized.source;
                this.abtest_tag = threadPersonalized.abtest_tag;
                this.dislike_resource = ThreadPersonalized.copyOf(threadPersonalized.dislike_resource);
            }
        }

        /* JADX DEBUG: Method merged with bridge method */
        @Override // com.squareup.wire.Message.Builder
        public ThreadPersonalized build(boolean z) {
            return new ThreadPersonalized(this, z, null);
        }
    }
}
