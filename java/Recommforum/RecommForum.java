package tbclient.Recommforum;

import com.squareup.wire.Message;
import com.squareup.wire.ProtoField;
import java.util.Collections;
import java.util.List;
import tbclient.RecommendForumInfo;
/* loaded from: classes7.dex */
public final class RecommForum extends Message {
    public static final List<RecommendForumInfo> DEFAULT_FORUMS = Collections.emptyList();
    public static final Integer DEFAULT_PAGE_SIZE = 0;
    public static final String DEFAULT_TITLE = "";
    @ProtoField(label = Message.Label.REPEATED, tag = 2)
    public final List<RecommendForumInfo> forums;
    @ProtoField(tag = 3, type = Message.Datatype.INT32)
    public final Integer page_size;
    @ProtoField(tag = 1, type = Message.Datatype.STRING)
    public final String title;

    private RecommForum(Builder builder, boolean z) {
        super(builder);
        if (z) {
            if (builder.title == null) {
                this.title = "";
            } else {
                this.title = builder.title;
            }
            if (builder.forums == null) {
                this.forums = DEFAULT_FORUMS;
            } else {
                this.forums = immutableCopyOf(builder.forums);
            }
            if (builder.page_size == null) {
                this.page_size = DEFAULT_PAGE_SIZE;
                return;
            } else {
                this.page_size = builder.page_size;
                return;
            }
        }
        this.title = builder.title;
        this.forums = immutableCopyOf(builder.forums);
        this.page_size = builder.page_size;
    }

    /* loaded from: classes7.dex */
    public static final class Builder extends Message.Builder<RecommForum> {
        public List<RecommendForumInfo> forums;
        public Integer page_size;
        public String title;

        public Builder() {
        }

        public Builder(RecommForum recommForum) {
            super(recommForum);
            if (recommForum != null) {
                this.title = recommForum.title;
                this.forums = RecommForum.copyOf(recommForum.forums);
                this.page_size = recommForum.page_size;
            }
        }

        /* JADX DEBUG: Method merged with bridge method */
        @Override // com.squareup.wire.Message.Builder
        public RecommForum build(boolean z) {
            return new RecommForum(this, z);
        }
    }
}
