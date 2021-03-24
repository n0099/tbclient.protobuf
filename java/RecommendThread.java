package tbclient;

import com.squareup.wire.Message;
import com.squareup.wire.ProtoField;
import java.util.Collections;
import java.util.List;
/* loaded from: classes.dex */
public final class RecommendThread extends Message {
    public static final String DEFAULT_TITLE = "";
    @ProtoField(tag = 3, type = Message.Datatype.UINT64)
    public final Long post_num;
    @ProtoField(label = Message.Label.REPEATED, tag = 4, type = Message.Datatype.STRING)
    public final List<String> term_list;
    @ProtoField(tag = 1, type = Message.Datatype.UINT64)
    public final Long tid;
    @ProtoField(tag = 2, type = Message.Datatype.STRING)
    public final String title;
    public static final Long DEFAULT_TID = 0L;
    public static final Long DEFAULT_POST_NUM = 0L;
    public static final List<String> DEFAULT_TERM_LIST = Collections.emptyList();

    /* loaded from: classes7.dex */
    public static final class Builder extends Message.Builder<RecommendThread> {
        public Long post_num;
        public List<String> term_list;
        public Long tid;
        public String title;

        public Builder() {
        }

        public Builder(RecommendThread recommendThread) {
            super(recommendThread);
            if (recommendThread == null) {
                return;
            }
            this.tid = recommendThread.tid;
            this.title = recommendThread.title;
            this.post_num = recommendThread.post_num;
            this.term_list = Message.copyOf(recommendThread.term_list);
        }

        /* JADX DEBUG: Method merged with bridge method */
        @Override // com.squareup.wire.Message.Builder
        public RecommendThread build(boolean z) {
            return new RecommendThread(this, z);
        }
    }

    public RecommendThread(Builder builder, boolean z) {
        super(builder);
        if (z) {
            Long l = builder.tid;
            if (l == null) {
                this.tid = DEFAULT_TID;
            } else {
                this.tid = l;
            }
            String str = builder.title;
            if (str == null) {
                this.title = "";
            } else {
                this.title = str;
            }
            Long l2 = builder.post_num;
            if (l2 == null) {
                this.post_num = DEFAULT_POST_NUM;
            } else {
                this.post_num = l2;
            }
            List<String> list = builder.term_list;
            if (list == null) {
                this.term_list = DEFAULT_TERM_LIST;
                return;
            } else {
                this.term_list = Message.immutableCopyOf(list);
                return;
            }
        }
        this.tid = builder.tid;
        this.title = builder.title;
        this.post_num = builder.post_num;
        this.term_list = Message.immutableCopyOf(builder.term_list);
    }
}
