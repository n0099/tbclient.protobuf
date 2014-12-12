package tbclient.GetSingleGameList;

import com.squareup.wire.Message;
import com.squareup.wire.ProtoField;
import java.util.Collections;
import java.util.List;
import tbclient.GameInfo;
/* loaded from: classes.dex */
public final class ResData extends Message {
    @ProtoField(label = Message.Label.REPEATED, tag = 1)
    public final List<AdList> ad_list;
    @ProtoField(tag = 3, type = Message.Datatype.UINT32)
    public final Integer count;
    @ProtoField(tag = 4, type = Message.Datatype.UINT32)
    public final Integer has_more;
    @ProtoField(label = Message.Label.REPEATED, tag = 2)
    public final List<GameInfo> single_game_list;
    public static final List<AdList> DEFAULT_AD_LIST = Collections.emptyList();
    public static final List<GameInfo> DEFAULT_SINGLE_GAME_LIST = Collections.emptyList();
    public static final Integer DEFAULT_COUNT = 0;
    public static final Integer DEFAULT_HAS_MORE = 0;

    /* synthetic */ ResData(Builder builder, boolean z, ResData resData) {
        this(builder, z);
    }

    private ResData(Builder builder, boolean z) {
        super(builder);
        if (z) {
            if (builder.ad_list == null) {
                this.ad_list = DEFAULT_AD_LIST;
            } else {
                this.ad_list = immutableCopyOf(builder.ad_list);
            }
            if (builder.single_game_list == null) {
                this.single_game_list = DEFAULT_SINGLE_GAME_LIST;
            } else {
                this.single_game_list = immutableCopyOf(builder.single_game_list);
            }
            if (builder.count == null) {
                this.count = DEFAULT_COUNT;
            } else {
                this.count = builder.count;
            }
            if (builder.has_more == null) {
                this.has_more = DEFAULT_HAS_MORE;
                return;
            } else {
                this.has_more = builder.has_more;
                return;
            }
        }
        this.ad_list = immutableCopyOf(builder.ad_list);
        this.single_game_list = immutableCopyOf(builder.single_game_list);
        this.count = builder.count;
        this.has_more = builder.has_more;
    }

    /* loaded from: classes.dex */
    public final class Builder extends Message.Builder<ResData> {
        public List<AdList> ad_list;
        public Integer count;
        public Integer has_more;
        public List<GameInfo> single_game_list;

        public Builder(ResData resData) {
            super(resData);
            if (resData != null) {
                this.ad_list = ResData.copyOf(resData.ad_list);
                this.single_game_list = ResData.copyOf(resData.single_game_list);
                this.count = resData.count;
                this.has_more = resData.has_more;
            }
        }

        /* JADX DEBUG: Method merged with bridge method */
        @Override // com.squareup.wire.Message.Builder
        public ResData build(boolean z) {
            return new ResData(this, z, null);
        }
    }
}
