package tbclient.SearchSug;

import com.squareup.wire.Message;
import com.squareup.wire.ProtoField;
import java.util.Collections;
import java.util.List;
/* loaded from: classes3.dex */
public final class DataRes extends Message {
    public static final Integer DEFAULT_FORUM_LOC = 0;
    public static final List<String> DEFAULT_LIST = Collections.emptyList();
    @ProtoField(tag = 1, type = Message.Datatype.INT32)
    public final Integer forum_loc;
    @ProtoField(label = Message.Label.REPEATED, tag = 2, type = Message.Datatype.STRING)
    public final List<String> list;

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
                return;
            } else {
                this.list = immutableCopyOf(builder.list);
                return;
            }
        }
        this.forum_loc = builder.forum_loc;
        this.list = immutableCopyOf(builder.list);
    }

    /* loaded from: classes3.dex */
    public static final class Builder extends Message.Builder<DataRes> {
        public Integer forum_loc;
        public List<String> list;

        public Builder() {
        }

        public Builder(DataRes dataRes) {
            super(dataRes);
            if (dataRes != null) {
                this.forum_loc = dataRes.forum_loc;
                this.list = DataRes.copyOf(dataRes.list);
            }
        }

        /* JADX DEBUG: Method merged with bridge method */
        @Override // com.squareup.wire.Message.Builder
        public DataRes build(boolean z) {
            return new DataRes(this, z);
        }
    }
}
