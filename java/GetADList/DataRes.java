package tbclient.GetADList;

import com.squareup.wire.Message;
import com.squareup.wire.ProtoField;
import java.util.Collections;
import java.util.List;
import tbclient.AdInfo;
/* loaded from: classes8.dex */
public final class DataRes extends Message {
    public static final List<AdInfo> DEFAULT_AD_LIST = Collections.emptyList();
    public static final Integer DEFAULT_HAS_MORE = 0;
    public static final Long DEFAULT_OFFSET = 0L;
    @ProtoField(label = Message.Label.REPEATED, tag = 1)
    public final List<AdInfo> ad_list;
    @ProtoField(tag = 2, type = Message.Datatype.INT32)
    public final Integer has_more;
    @ProtoField(tag = 3, type = Message.Datatype.INT64)
    public final Long offset;

    /* loaded from: classes8.dex */
    public static final class Builder extends Message.Builder<DataRes> {
        public List<AdInfo> ad_list;
        public Integer has_more;
        public Long offset;

        public Builder() {
        }

        public Builder(DataRes dataRes) {
            super(dataRes);
            if (dataRes == null) {
                return;
            }
            this.ad_list = Message.copyOf(dataRes.ad_list);
            this.has_more = dataRes.has_more;
            this.offset = dataRes.offset;
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
            List<AdInfo> list = builder.ad_list;
            if (list == null) {
                this.ad_list = DEFAULT_AD_LIST;
            } else {
                this.ad_list = Message.immutableCopyOf(list);
            }
            Integer num = builder.has_more;
            if (num == null) {
                this.has_more = DEFAULT_HAS_MORE;
            } else {
                this.has_more = num;
            }
            Long l = builder.offset;
            if (l == null) {
                this.offset = DEFAULT_OFFSET;
                return;
            } else {
                this.offset = l;
                return;
            }
        }
        this.ad_list = Message.immutableCopyOf(builder.ad_list);
        this.has_more = builder.has_more;
        this.offset = builder.offset;
    }
}
