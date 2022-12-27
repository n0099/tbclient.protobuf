package tbclient.RecomVertical;

import com.squareup.wire.Message;
import com.squareup.wire.ProtoField;
import java.util.Collections;
import java.util.List;
/* loaded from: classes9.dex */
public final class ThreadPersonalized extends Message {
    public static final String DEFAULT_ABTEST_TAG = "";
    public static final String DEFAULT_EXTRA = "";
    public static final String DEFAULT_SOURCE = "";
    public static final String DEFAULT_WEIGHT = "";
    @ProtoField(tag = 4, type = Message.Datatype.STRING)
    public final String abtest_tag;
    @ProtoField(label = Message.Label.REPEATED, tag = 5)
    public final List<DislikeReason> dislike_resource;
    @ProtoField(tag = 6, type = Message.Datatype.STRING)
    public final String extra;
    @ProtoField(tag = 3, type = Message.Datatype.STRING)
    public final String source;
    @ProtoField(tag = 1, type = Message.Datatype.UINT64)
    public final Long tid;
    @ProtoField(tag = 2, type = Message.Datatype.STRING)
    public final String weight;
    public static final Long DEFAULT_TID = 0L;
    public static final List<DislikeReason> DEFAULT_DISLIKE_RESOURCE = Collections.emptyList();

    /* loaded from: classes9.dex */
    public static final class Builder extends Message.Builder<ThreadPersonalized> {
        public String abtest_tag;
        public List<DislikeReason> dislike_resource;
        public String extra;
        public String source;
        public Long tid;
        public String weight;

        public Builder() {
        }

        public Builder(ThreadPersonalized threadPersonalized) {
            super(threadPersonalized);
            if (threadPersonalized == null) {
                return;
            }
            this.tid = threadPersonalized.tid;
            this.weight = threadPersonalized.weight;
            this.source = threadPersonalized.source;
            this.abtest_tag = threadPersonalized.abtest_tag;
            this.dislike_resource = Message.copyOf(threadPersonalized.dislike_resource);
            this.extra = threadPersonalized.extra;
        }

        /* JADX DEBUG: Method merged with bridge method */
        @Override // com.squareup.wire.Message.Builder
        public ThreadPersonalized build(boolean z) {
            return new ThreadPersonalized(this, z);
        }
    }

    public ThreadPersonalized(Builder builder, boolean z) {
        super(builder);
        if (z) {
            Long l = builder.tid;
            if (l == null) {
                this.tid = DEFAULT_TID;
            } else {
                this.tid = l;
            }
            String str = builder.weight;
            if (str == null) {
                this.weight = "";
            } else {
                this.weight = str;
            }
            String str2 = builder.source;
            if (str2 == null) {
                this.source = "";
            } else {
                this.source = str2;
            }
            String str3 = builder.abtest_tag;
            if (str3 == null) {
                this.abtest_tag = "";
            } else {
                this.abtest_tag = str3;
            }
            List<DislikeReason> list = builder.dislike_resource;
            if (list == null) {
                this.dislike_resource = DEFAULT_DISLIKE_RESOURCE;
            } else {
                this.dislike_resource = Message.immutableCopyOf(list);
            }
            String str4 = builder.extra;
            if (str4 == null) {
                this.extra = "";
                return;
            } else {
                this.extra = str4;
                return;
            }
        }
        this.tid = builder.tid;
        this.weight = builder.weight;
        this.source = builder.source;
        this.abtest_tag = builder.abtest_tag;
        this.dislike_resource = Message.immutableCopyOf(builder.dislike_resource);
        this.extra = builder.extra;
    }
}
