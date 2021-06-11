package tbclient.AgreeMe;

import com.squareup.wire.Message;
import com.squareup.wire.ProtoField;
import java.util.Collections;
import java.util.List;
import tbclient.AgreeList;
/* loaded from: classes8.dex */
public final class DataRes extends Message {
    @ProtoField(label = Message.Label.REPEATED, tag = 2)
    public final List<AgreeList> agree_list;
    @ProtoField(tag = 1, type = Message.Datatype.INT32)
    public final Integer has_more;
    public static final Integer DEFAULT_HAS_MORE = 0;
    public static final List<AgreeList> DEFAULT_AGREE_LIST = Collections.emptyList();

    /* loaded from: classes8.dex */
    public static final class Builder extends Message.Builder<DataRes> {
        public List<AgreeList> agree_list;
        public Integer has_more;

        public Builder() {
        }

        public Builder(DataRes dataRes) {
            super(dataRes);
            if (dataRes == null) {
                return;
            }
            this.has_more = dataRes.has_more;
            this.agree_list = Message.copyOf(dataRes.agree_list);
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
            Integer num = builder.has_more;
            if (num == null) {
                this.has_more = DEFAULT_HAS_MORE;
            } else {
                this.has_more = num;
            }
            List<AgreeList> list = builder.agree_list;
            if (list == null) {
                this.agree_list = DEFAULT_AGREE_LIST;
                return;
            } else {
                this.agree_list = Message.immutableCopyOf(list);
                return;
            }
        }
        this.has_more = builder.has_more;
        this.agree_list = Message.immutableCopyOf(builder.agree_list);
    }
}
