package tbclient.GetCartoonCategoryList;

import com.squareup.wire.Message;
import com.squareup.wire.ProtoField;
import java.util.Collections;
import java.util.List;
/* loaded from: classes.dex */
public final class DataRes extends Message {
    public static final List<CartoonInfo> DEFAULT_CARTOON_LIST = Collections.emptyList();
    public static final Integer DEFAULT_HAS_MORE = 0;
    @ProtoField(label = Message.Label.REPEATED, tag = 1)
    public final List<CartoonInfo> cartoon_list;
    @ProtoField(tag = 2, type = Message.Datatype.INT32)
    public final Integer has_more;

    /* synthetic */ DataRes(Builder builder, boolean z, DataRes dataRes) {
        this(builder, z);
    }

    private DataRes(Builder builder, boolean z) {
        super(builder);
        if (z) {
            if (builder.cartoon_list == null) {
                this.cartoon_list = DEFAULT_CARTOON_LIST;
            } else {
                this.cartoon_list = immutableCopyOf(builder.cartoon_list);
            }
            if (builder.has_more == null) {
                this.has_more = DEFAULT_HAS_MORE;
                return;
            } else {
                this.has_more = builder.has_more;
                return;
            }
        }
        this.cartoon_list = immutableCopyOf(builder.cartoon_list);
        this.has_more = builder.has_more;
    }

    /* loaded from: classes.dex */
    public static final class Builder extends Message.Builder<DataRes> {
        public List<CartoonInfo> cartoon_list;
        public Integer has_more;

        public Builder() {
        }

        public Builder(DataRes dataRes) {
            super(dataRes);
            if (dataRes != null) {
                this.cartoon_list = DataRes.copyOf(dataRes.cartoon_list);
                this.has_more = dataRes.has_more;
            }
        }

        /* JADX DEBUG: Method merged with bridge method */
        @Override // com.squareup.wire.Message.Builder
        public DataRes build(boolean z) {
            return new DataRes(this, z, null);
        }
    }
}
