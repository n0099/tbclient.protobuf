package tbclient.GetSuggestionByAddrName;

import com.squareup.wire.Message;
import com.squareup.wire.ProtoField;
import java.util.Collections;
import java.util.List;
import tbclient.Lbs;
/* loaded from: classes7.dex */
public final class DataRes extends Message {
    public static final List<Lbs> DEFAULT_POI_INFO = Collections.emptyList();
    @ProtoField(label = Message.Label.REPEATED, tag = 1)
    public final List<Lbs> poi_info;

    private DataRes(Builder builder, boolean z) {
        super(builder);
        if (z) {
            if (builder.poi_info == null) {
                this.poi_info = DEFAULT_POI_INFO;
                return;
            } else {
                this.poi_info = immutableCopyOf(builder.poi_info);
                return;
            }
        }
        this.poi_info = immutableCopyOf(builder.poi_info);
    }

    /* loaded from: classes7.dex */
    public static final class Builder extends Message.Builder<DataRes> {
        public List<Lbs> poi_info;

        public Builder() {
        }

        public Builder(DataRes dataRes) {
            super(dataRes);
            if (dataRes != null) {
                this.poi_info = DataRes.copyOf(dataRes.poi_info);
            }
        }

        /* JADX DEBUG: Method merged with bridge method */
        @Override // com.squareup.wire.Message.Builder
        public DataRes build(boolean z) {
            return new DataRes(this, z);
        }
    }
}
