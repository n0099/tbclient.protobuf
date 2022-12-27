package tbclient.ItemManage;

import com.squareup.wire.Message;
import com.squareup.wire.ProtoField;
import java.util.Collections;
import java.util.List;
import tbclient.ManageInfo;
/* loaded from: classes9.dex */
public final class DataRes extends Message {
    @ProtoField(tag = 3, type = Message.Datatype.INT32)
    public final Integer has_more;
    @ProtoField(label = Message.Label.REPEATED, tag = 1)
    public final List<ManageInfo> manage_list;
    @ProtoField(label = Message.Label.REPEATED, tag = 2)
    public final List<ManageInfo> manage_recomm_list;
    public static final List<ManageInfo> DEFAULT_MANAGE_LIST = Collections.emptyList();
    public static final List<ManageInfo> DEFAULT_MANAGE_RECOMM_LIST = Collections.emptyList();
    public static final Integer DEFAULT_HAS_MORE = 0;

    /* loaded from: classes9.dex */
    public static final class Builder extends Message.Builder<DataRes> {
        public Integer has_more;
        public List<ManageInfo> manage_list;
        public List<ManageInfo> manage_recomm_list;

        public Builder() {
        }

        public Builder(DataRes dataRes) {
            super(dataRes);
            if (dataRes == null) {
                return;
            }
            this.manage_list = Message.copyOf(dataRes.manage_list);
            this.manage_recomm_list = Message.copyOf(dataRes.manage_recomm_list);
            this.has_more = dataRes.has_more;
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
            List<ManageInfo> list = builder.manage_list;
            if (list == null) {
                this.manage_list = DEFAULT_MANAGE_LIST;
            } else {
                this.manage_list = Message.immutableCopyOf(list);
            }
            List<ManageInfo> list2 = builder.manage_recomm_list;
            if (list2 == null) {
                this.manage_recomm_list = DEFAULT_MANAGE_RECOMM_LIST;
            } else {
                this.manage_recomm_list = Message.immutableCopyOf(list2);
            }
            Integer num = builder.has_more;
            if (num == null) {
                this.has_more = DEFAULT_HAS_MORE;
                return;
            } else {
                this.has_more = num;
                return;
            }
        }
        this.manage_list = Message.immutableCopyOf(builder.manage_list);
        this.manage_recomm_list = Message.immutableCopyOf(builder.manage_recomm_list);
        this.has_more = builder.has_more;
    }
}
