package tbclient.GetForumPrivateInfo;

import com.squareup.wire.Message;
import com.squareup.wire.ProtoField;
import java.util.Collections;
import java.util.List;
/* loaded from: classes8.dex */
public final class DataRes extends Message {
    public static final List<ForumInfo> DEFAULT_FORUM_LIST = Collections.emptyList();
    public static final Integer DEFAULT_HAS_MORE = 0;
    public static final Integer DEFAULT_MASK_TYPE = 0;
    @ProtoField(label = Message.Label.REPEATED, tag = 1)
    public final List<ForumInfo> forum_list;
    @ProtoField(tag = 2, type = Message.Datatype.INT32)
    public final Integer has_more;
    @ProtoField(tag = 3, type = Message.Datatype.INT32)
    public final Integer mask_type;

    private DataRes(Builder builder, boolean z) {
        super(builder);
        if (z) {
            if (builder.forum_list == null) {
                this.forum_list = DEFAULT_FORUM_LIST;
            } else {
                this.forum_list = immutableCopyOf(builder.forum_list);
            }
            if (builder.has_more == null) {
                this.has_more = DEFAULT_HAS_MORE;
            } else {
                this.has_more = builder.has_more;
            }
            if (builder.mask_type == null) {
                this.mask_type = DEFAULT_MASK_TYPE;
                return;
            } else {
                this.mask_type = builder.mask_type;
                return;
            }
        }
        this.forum_list = immutableCopyOf(builder.forum_list);
        this.has_more = builder.has_more;
        this.mask_type = builder.mask_type;
    }

    /* loaded from: classes8.dex */
    public static final class Builder extends Message.Builder<DataRes> {
        public List<ForumInfo> forum_list;
        public Integer has_more;
        public Integer mask_type;

        public Builder() {
        }

        public Builder(DataRes dataRes) {
            super(dataRes);
            if (dataRes != null) {
                this.forum_list = DataRes.copyOf(dataRes.forum_list);
                this.has_more = dataRes.has_more;
                this.mask_type = dataRes.mask_type;
            }
        }

        /* JADX DEBUG: Method merged with bridge method */
        @Override // com.squareup.wire.Message.Builder
        public DataRes build(boolean z) {
            return new DataRes(this, z);
        }
    }
}
