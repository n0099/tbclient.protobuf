package tbclient.ActivityPage;

import com.squareup.wire.Message;
import com.squareup.wire.ProtoField;
import java.util.Collections;
import java.util.List;
import tbclient.RecommendForumInfo;
/* loaded from: classes22.dex */
public final class RecommendForumList extends Message {
    public static final String DEFAULT_CLASS_NAME = "";
    public static final Integer DEFAULT_FLOOR_POSITION = 0;
    public static final List<RecommendForumInfo> DEFAULT_FORUM_LIST = Collections.emptyList();
    @ProtoField(tag = 2, type = Message.Datatype.STRING)
    public final String class_name;
    @ProtoField(tag = 1, type = Message.Datatype.UINT32)
    public final Integer floor_position;
    @ProtoField(label = Message.Label.REPEATED, tag = 3)
    public final List<RecommendForumInfo> forum_list;

    private RecommendForumList(Builder builder, boolean z) {
        super(builder);
        if (z) {
            if (builder.floor_position == null) {
                this.floor_position = DEFAULT_FLOOR_POSITION;
            } else {
                this.floor_position = builder.floor_position;
            }
            if (builder.class_name == null) {
                this.class_name = "";
            } else {
                this.class_name = builder.class_name;
            }
            if (builder.forum_list == null) {
                this.forum_list = DEFAULT_FORUM_LIST;
                return;
            } else {
                this.forum_list = immutableCopyOf(builder.forum_list);
                return;
            }
        }
        this.floor_position = builder.floor_position;
        this.class_name = builder.class_name;
        this.forum_list = immutableCopyOf(builder.forum_list);
    }

    /* loaded from: classes22.dex */
    public static final class Builder extends Message.Builder<RecommendForumList> {
        public String class_name;
        public Integer floor_position;
        public List<RecommendForumInfo> forum_list;

        public Builder() {
        }

        public Builder(RecommendForumList recommendForumList) {
            super(recommendForumList);
            if (recommendForumList != null) {
                this.floor_position = recommendForumList.floor_position;
                this.class_name = recommendForumList.class_name;
                this.forum_list = RecommendForumList.copyOf(recommendForumList.forum_list);
            }
        }

        /* JADX DEBUG: Method merged with bridge method */
        @Override // com.squareup.wire.Message.Builder
        public RecommendForumList build(boolean z) {
            return new RecommendForumList(this, z);
        }
    }
}