package tbclient.SearchSug;

import com.squareup.wire.Message;
import com.squareup.wire.ProtoField;
import java.util.Collections;
import java.util.List;
/* loaded from: classes9.dex */
public final class DataRes extends Message {
    @ProtoField(label = Message.Label.REPEATED, tag = 3)
    public final List<ForumInfo> forum_list;
    @ProtoField(tag = 1, type = Message.Datatype.INT32)
    public final Integer forum_loc;
    @ProtoField(label = Message.Label.REPEATED, tag = 2, type = Message.Datatype.STRING)
    public final List<String> list;
    public static final Integer DEFAULT_FORUM_LOC = 0;
    public static final List<String> DEFAULT_LIST = Collections.emptyList();
    public static final List<ForumInfo> DEFAULT_FORUM_LIST = Collections.emptyList();

    private DataRes(Builder builder, boolean z) {
        super(builder);
        if (z) {
            if (builder.forum_loc == null) {
                this.forum_loc = DEFAULT_FORUM_LOC;
            } else {
                this.forum_loc = builder.forum_loc;
            }
            if (builder.list == null) {
                this.list = DEFAULT_LIST;
            } else {
                this.list = immutableCopyOf(builder.list);
            }
            if (builder.forum_list == null) {
                this.forum_list = DEFAULT_FORUM_LIST;
                return;
            } else {
                this.forum_list = immutableCopyOf(builder.forum_list);
                return;
            }
        }
        this.forum_loc = builder.forum_loc;
        this.list = immutableCopyOf(builder.list);
        this.forum_list = immutableCopyOf(builder.forum_list);
    }

    /* loaded from: classes9.dex */
    public static final class Builder extends Message.Builder<DataRes> {
        public List<ForumInfo> forum_list;
        public Integer forum_loc;
        public List<String> list;

        public Builder() {
        }

        public Builder(DataRes dataRes) {
            super(dataRes);
            if (dataRes != null) {
                this.forum_loc = dataRes.forum_loc;
                this.list = DataRes.copyOf(dataRes.list);
                this.forum_list = DataRes.copyOf(dataRes.forum_list);
            }
        }

        /* JADX DEBUG: Method merged with bridge method */
        @Override // com.squareup.wire.Message.Builder
        public DataRes build(boolean z) {
            return new DataRes(this, z);
        }
    }
}
