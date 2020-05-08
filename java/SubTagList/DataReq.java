package tbclient.SubTagList;

import com.squareup.wire.Message;
import com.squareup.wire.ProtoField;
import java.util.Collections;
import java.util.List;
import tbclient.CommonReq;
/* loaded from: classes10.dex */
public final class DataReq extends Message {
    public static final List<Integer> DEFAULT_ARR_TAG_ID = Collections.emptyList();
    @ProtoField(label = Message.Label.REPEATED, tag = 3, type = Message.Datatype.INT32)
    public final List<Integer> arr_tag_id;
    @ProtoField(tag = 1)

    /* renamed from: common  reason: collision with root package name */
    public final CommonReq f1251common;

    private DataReq(Builder builder, boolean z) {
        super(builder);
        if (z) {
            this.f1251common = builder.f1252common;
            if (builder.arr_tag_id == null) {
                this.arr_tag_id = DEFAULT_ARR_TAG_ID;
                return;
            } else {
                this.arr_tag_id = immutableCopyOf(builder.arr_tag_id);
                return;
            }
        }
        this.f1251common = builder.f1252common;
        this.arr_tag_id = immutableCopyOf(builder.arr_tag_id);
    }

    /* loaded from: classes10.dex */
    public static final class Builder extends Message.Builder<DataReq> {
        public List<Integer> arr_tag_id;

        /* renamed from: common  reason: collision with root package name */
        public CommonReq f1252common;

        public Builder() {
        }

        public Builder(DataReq dataReq) {
            super(dataReq);
            if (dataReq != null) {
                this.f1252common = dataReq.f1251common;
                this.arr_tag_id = DataReq.copyOf(dataReq.arr_tag_id);
            }
        }

        /* JADX DEBUG: Method merged with bridge method */
        @Override // com.squareup.wire.Message.Builder
        public DataReq build(boolean z) {
            return new DataReq(this, z);
        }
    }
}
