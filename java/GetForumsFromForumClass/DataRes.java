package tbclient.GetForumsFromForumClass;

import com.squareup.wire.Message;
import com.squareup.wire.ProtoField;
import java.util.Collections;
import java.util.List;
/* loaded from: classes4.dex */
public final class DataRes extends Message {
    public static final List<ForumSpaceForumInfo> DEFAULT_FORUM_INFO = Collections.emptyList();
    public static final Integer DEFAULT_HAS_MORE = 0;
    @ProtoField(label = Message.Label.REPEATED, tag = 1)
    public final List<ForumSpaceForumInfo> forum_info;
    @ProtoField(tag = 2, type = Message.Datatype.INT32)
    public final Integer has_more;

    private DataRes(Builder builder, boolean z) {
        super(builder);
        if (z) {
            if (builder.forum_info == null) {
                this.forum_info = DEFAULT_FORUM_INFO;
            } else {
                this.forum_info = immutableCopyOf(builder.forum_info);
            }
            if (builder.has_more == null) {
                this.has_more = DEFAULT_HAS_MORE;
                return;
            } else {
                this.has_more = builder.has_more;
                return;
            }
        }
        this.forum_info = immutableCopyOf(builder.forum_info);
        this.has_more = builder.has_more;
    }

    /* loaded from: classes4.dex */
    public static final class Builder extends Message.Builder<DataRes> {
        public List<ForumSpaceForumInfo> forum_info;
        public Integer has_more;

        public Builder() {
        }

        public Builder(DataRes dataRes) {
            super(dataRes);
            if (dataRes != null) {
                this.forum_info = DataRes.copyOf(dataRes.forum_info);
                this.has_more = dataRes.has_more;
            }
        }

        /* JADX DEBUG: Method merged with bridge method */
        @Override // com.squareup.wire.Message.Builder
        public DataRes build(boolean z) {
            return new DataRes(this, z);
        }
    }
}
