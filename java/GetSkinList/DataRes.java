package tbclient.GetSkinList;

import com.squareup.wire.Message;
import com.squareup.wire.ProtoField;
import java.util.Collections;
import java.util.List;
import tbclient.ThemeRecommand;
import tbclient.ThemeSkinPropMain;
/* loaded from: classes.dex */
public final class DataRes extends Message {
    @ProtoField(tag = 3, type = Message.Datatype.UINT32)
    public final Integer hasmore;
    @ProtoField(tag = 2)
    public final ThemeRecommand recommend;
    @ProtoField(label = Message.Label.REPEATED, tag = 1)
    public final List<ThemeSkinPropMain> skins;
    public static final List<ThemeSkinPropMain> DEFAULT_SKINS = Collections.emptyList();
    public static final Integer DEFAULT_HASMORE = 0;

    /* loaded from: classes7.dex */
    public static final class Builder extends Message.Builder<DataRes> {
        public Integer hasmore;
        public ThemeRecommand recommend;
        public List<ThemeSkinPropMain> skins;

        public Builder() {
        }

        public Builder(DataRes dataRes) {
            super(dataRes);
            if (dataRes == null) {
                return;
            }
            this.skins = Message.copyOf(dataRes.skins);
            this.recommend = dataRes.recommend;
            this.hasmore = dataRes.hasmore;
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
            List<ThemeSkinPropMain> list = builder.skins;
            if (list == null) {
                this.skins = DEFAULT_SKINS;
            } else {
                this.skins = Message.immutableCopyOf(list);
            }
            this.recommend = builder.recommend;
            Integer num = builder.hasmore;
            if (num == null) {
                this.hasmore = DEFAULT_HASMORE;
                return;
            } else {
                this.hasmore = num;
                return;
            }
        }
        this.skins = Message.immutableCopyOf(builder.skins);
        this.recommend = builder.recommend;
        this.hasmore = builder.hasmore;
    }
}
