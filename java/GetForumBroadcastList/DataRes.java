package tbclient.GetForumBroadcastList;

import com.squareup.wire.Message;
import com.squareup.wire.ProtoField;
import java.util.Collections;
import java.util.List;
import tbclient.BroadcastInfo;
import tbclient.Page;
/* loaded from: classes9.dex */
public final class DataRes extends Message {
    public static final List<BroadcastInfo> DEFAULT_BCAST_INFOS = Collections.emptyList();
    @ProtoField(label = Message.Label.REPEATED, tag = 1)
    public final List<BroadcastInfo> bcast_infos;
    @ProtoField(tag = 3)
    public final Page page;

    /* loaded from: classes9.dex */
    public static final class Builder extends Message.Builder<DataRes> {
        public List<BroadcastInfo> bcast_infos;
        public Page page;

        public Builder() {
        }

        public Builder(DataRes dataRes) {
            super(dataRes);
            if (dataRes == null) {
                return;
            }
            this.bcast_infos = Message.copyOf(dataRes.bcast_infos);
            this.page = dataRes.page;
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
            List<BroadcastInfo> list = builder.bcast_infos;
            if (list == null) {
                this.bcast_infos = DEFAULT_BCAST_INFOS;
            } else {
                this.bcast_infos = Message.immutableCopyOf(list);
            }
            this.page = builder.page;
            return;
        }
        this.bcast_infos = Message.immutableCopyOf(builder.bcast_infos);
        this.page = builder.page;
    }
}
