package tbclient.GetForumClassList;

import com.squareup.wire.Message;
import com.squareup.wire.ProtoField;
import java.util.Collections;
import java.util.List;
/* loaded from: classes.dex */
public final class ForumSquareBanner extends Message {
    @ProtoField(tag = 2, type = Message.Datatype.INT64)
    public final Long forum_counts;
    @ProtoField(label = Message.Label.REPEATED, tag = 1)
    public final List<BannerBaseInfo> infos;
    public static final List<BannerBaseInfo> DEFAULT_INFOS = Collections.emptyList();
    public static final Long DEFAULT_FORUM_COUNTS = 0L;

    /* synthetic */ ForumSquareBanner(Builder builder, boolean z, ForumSquareBanner forumSquareBanner) {
        this(builder, z);
    }

    private ForumSquareBanner(Builder builder, boolean z) {
        super(builder);
        if (z) {
            if (builder.infos == null) {
                this.infos = DEFAULT_INFOS;
            } else {
                this.infos = immutableCopyOf(builder.infos);
            }
            if (builder.forum_counts == null) {
                this.forum_counts = DEFAULT_FORUM_COUNTS;
                return;
            } else {
                this.forum_counts = builder.forum_counts;
                return;
            }
        }
        this.infos = immutableCopyOf(builder.infos);
        this.forum_counts = builder.forum_counts;
    }

    /* loaded from: classes.dex */
    public static final class Builder extends Message.Builder<ForumSquareBanner> {
        public Long forum_counts;
        public List<BannerBaseInfo> infos;

        public Builder() {
        }

        public Builder(ForumSquareBanner forumSquareBanner) {
            super(forumSquareBanner);
            if (forumSquareBanner != null) {
                this.infos = ForumSquareBanner.copyOf(forumSquareBanner.infos);
                this.forum_counts = forumSquareBanner.forum_counts;
            }
        }

        /* JADX DEBUG: Method merged with bridge method */
        @Override // com.squareup.wire.Message.Builder
        public ForumSquareBanner build(boolean z) {
            return new ForumSquareBanner(this, z, null);
        }
    }
}
