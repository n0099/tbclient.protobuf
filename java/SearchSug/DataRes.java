package tbclient.SearchSug;

import com.squareup.wire.Message;
import com.squareup.wire.ProtoField;
import java.util.Collections;
import java.util.List;
/* loaded from: classes.dex */
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

    /* loaded from: classes7.dex */
    public static final class Builder extends Message.Builder<DataRes> {
        public List<ForumInfo> forum_list;
        public Integer forum_loc;
        public List<String> list;

        public Builder() {
        }

        public Builder(DataRes dataRes) {
            super(dataRes);
            if (dataRes == null) {
                return;
            }
            this.forum_loc = dataRes.forum_loc;
            this.list = Message.copyOf(dataRes.list);
            this.forum_list = Message.copyOf(dataRes.forum_list);
        }

        /* JADX DEBUG: Method merged with bridge method */
        @Override // com.squareup.wire.Message.Builder
        public DataRes build(boolean z) {
            return new DataRes(this, z);
        }
    }

    public DataRes(Builder builder, boolean z) {
        super(builder);
        if (z) {
            Integer num = builder.forum_loc;
            if (num == null) {
                this.forum_loc = DEFAULT_FORUM_LOC;
            } else {
                this.forum_loc = num;
            }
            List<String> list = builder.list;
            if (list == null) {
                this.list = DEFAULT_LIST;
            } else {
                this.list = Message.immutableCopyOf(list);
            }
            List<ForumInfo> list2 = builder.forum_list;
            if (list2 == null) {
                this.forum_list = DEFAULT_FORUM_LIST;
                return;
            } else {
                this.forum_list = Message.immutableCopyOf(list2);
                return;
            }
        }
        this.forum_loc = builder.forum_loc;
        this.list = Message.immutableCopyOf(builder.list);
        this.forum_list = Message.immutableCopyOf(builder.forum_list);
    }
}
