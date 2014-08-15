package tbclient.GetGameCenter;

import com.squareup.wire.Message;
import com.squareup.wire.ProtoField;
import java.util.Collections;
import java.util.List;
/* loaded from: classes.dex */
public final class DataRes extends Message {
    public static final List<AdList> DEFAULT_AD_LIST = Collections.emptyList();
    @ProtoField(label = Message.Label.REPEATED, tag = 1)
    public final List<AdList> ad_list;
    @ProtoField(tag = 2)
    public final GameList game_list;

    /* synthetic */ DataRes(Builder builder, boolean z, DataRes dataRes) {
        this(builder, z);
    }

    private DataRes(Builder builder, boolean z) {
        super(builder);
        if (z) {
            if (builder.ad_list == null) {
                this.ad_list = DEFAULT_AD_LIST;
            } else {
                this.ad_list = immutableCopyOf(builder.ad_list);
            }
            this.game_list = builder.game_list;
            return;
        }
        this.ad_list = immutableCopyOf(builder.ad_list);
        this.game_list = builder.game_list;
    }

    /* loaded from: classes.dex */
    public final class Builder extends Message.Builder<DataRes> {
        public List<AdList> ad_list;
        public GameList game_list;

        public Builder(DataRes dataRes) {
            super(dataRes);
            if (dataRes != null) {
                this.ad_list = DataRes.copyOf(dataRes.ad_list);
                this.game_list = dataRes.game_list;
            }
        }

        /* JADX DEBUG: Method merged with bridge method */
        @Override // com.squareup.wire.Message.Builder
        public DataRes build(boolean z) {
            return new DataRes(this, z, null);
        }
    }
}
