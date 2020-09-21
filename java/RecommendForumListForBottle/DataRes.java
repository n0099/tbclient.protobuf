package tbclient.RecommendForumListForBottle;

import com.squareup.wire.Message;
import com.squareup.wire.ProtoField;
import java.util.Collections;
import java.util.List;
/* loaded from: classes21.dex */
public final class DataRes extends Message {
    public static final List<ForumInfo> DEFAULT_FORUM_INFO = Collections.emptyList();
    @ProtoField(label = Message.Label.REPEATED, tag = 1)
    public final List<ForumInfo> forum_info;

    private DataRes(Builder builder, boolean z) {
        super(builder);
        if (z) {
            if (builder.forum_info == null) {
                this.forum_info = DEFAULT_FORUM_INFO;
                return;
            } else {
                this.forum_info = immutableCopyOf(builder.forum_info);
                return;
            }
        }
        this.forum_info = immutableCopyOf(builder.forum_info);
    }

    /* loaded from: classes21.dex */
    public static final class Builder extends Message.Builder<DataRes> {
        public List<ForumInfo> forum_info;

        public Builder() {
        }

        public Builder(DataRes dataRes) {
            super(dataRes);
            if (dataRes != null) {
                this.forum_info = DataRes.copyOf(dataRes.forum_info);
            }
        }

        /* JADX DEBUG: Method merged with bridge method */
        @Override // com.squareup.wire.Message.Builder
        public DataRes build(boolean z) {
            return new DataRes(this, z);
        }
    }
}
