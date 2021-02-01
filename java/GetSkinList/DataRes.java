package tbclient.GetSkinList;

import com.squareup.wire.Message;
import com.squareup.wire.ProtoField;
import java.util.Collections;
import java.util.List;
import tbclient.ThemeRecommand;
import tbclient.ThemeSkinPropMain;
/* loaded from: classes9.dex */
public final class DataRes extends Message {
    @ProtoField(tag = 3, type = Message.Datatype.UINT32)
    public final Integer hasmore;
    @ProtoField(tag = 2)
    public final ThemeRecommand recommend;
    @ProtoField(label = Message.Label.REPEATED, tag = 1)
    public final List<ThemeSkinPropMain> skins;
    public static final List<ThemeSkinPropMain> DEFAULT_SKINS = Collections.emptyList();
    public static final Integer DEFAULT_HASMORE = 0;

    private DataRes(Builder builder, boolean z) {
        super(builder);
        if (z) {
            if (builder.skins == null) {
                this.skins = DEFAULT_SKINS;
            } else {
                this.skins = immutableCopyOf(builder.skins);
            }
            this.recommend = builder.recommend;
            if (builder.hasmore == null) {
                this.hasmore = DEFAULT_HASMORE;
                return;
            } else {
                this.hasmore = builder.hasmore;
                return;
            }
        }
        this.skins = immutableCopyOf(builder.skins);
        this.recommend = builder.recommend;
        this.hasmore = builder.hasmore;
    }

    /* loaded from: classes9.dex */
    public static final class Builder extends Message.Builder<DataRes> {
        public Integer hasmore;
        public ThemeRecommand recommend;
        public List<ThemeSkinPropMain> skins;

        public Builder() {
        }

        public Builder(DataRes dataRes) {
            super(dataRes);
            if (dataRes != null) {
                this.skins = DataRes.copyOf(dataRes.skins);
                this.recommend = dataRes.recommend;
                this.hasmore = dataRes.hasmore;
            }
        }

        /* JADX DEBUG: Method merged with bridge method */
        @Override // com.squareup.wire.Message.Builder
        public DataRes build(boolean z) {
            return new DataRes(this, z);
        }
    }
}
