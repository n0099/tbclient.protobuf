package tbclient.GetOfficialSwitch;

import com.squareup.wire.Message;
import com.squareup.wire.ProtoField;
import java.util.Collections;
import java.util.List;
/* loaded from: classes13.dex */
public final class DataRes extends Message {
    public static final List<OfficialList> DEFAULT_OFFICIAL_LIST = Collections.emptyList();
    @ProtoField(label = Message.Label.REPEATED, tag = 1)
    public final List<OfficialList> official_list;

    private DataRes(Builder builder, boolean z) {
        super(builder);
        if (z) {
            if (builder.official_list == null) {
                this.official_list = DEFAULT_OFFICIAL_LIST;
                return;
            } else {
                this.official_list = immutableCopyOf(builder.official_list);
                return;
            }
        }
        this.official_list = immutableCopyOf(builder.official_list);
    }

    /* loaded from: classes13.dex */
    public static final class Builder extends Message.Builder<DataRes> {
        public List<OfficialList> official_list;

        public Builder() {
        }

        public Builder(DataRes dataRes) {
            super(dataRes);
            if (dataRes != null) {
                this.official_list = DataRes.copyOf(dataRes.official_list);
            }
        }

        /* JADX DEBUG: Method merged with bridge method */
        @Override // com.squareup.wire.Message.Builder
        public DataRes build(boolean z) {
            return new DataRes(this, z);
        }
    }
}
