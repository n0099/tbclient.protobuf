package tbclient.FrsPage;

import com.squareup.wire.Message;
import com.squareup.wire.ProtoField;
import java.util.Collections;
import java.util.List;
/* loaded from: classes16.dex */
public final class WorldcupSkin extends Message {
    public static final String DEFAULT_WORLDCUP_BOTTOM = "";
    public static final String DEFAULT_WORLDCUP_BOTTOM_NIGHT = "";
    public static final String DEFAULT_WORLDCUP_TOP = "";
    public static final String DEFAULT_WORLDCUP_TOP_NIGHT = "";
    @ProtoField(label = Message.Label.REPEATED, tag = 6)
    public final List<TabSkin> tab_skin;
    @ProtoField(tag = 2, type = Message.Datatype.STRING)
    public final String worldcup_bottom;
    @ProtoField(tag = 3, type = Message.Datatype.STRING)
    public final String worldcup_bottom_night;
    @ProtoField(tag = 1, type = Message.Datatype.INT32)
    public final Integer worldcup_icon_height;
    @ProtoField(tag = 4, type = Message.Datatype.STRING)
    public final String worldcup_top;
    @ProtoField(tag = 5, type = Message.Datatype.STRING)
    public final String worldcup_top_night;
    public static final Integer DEFAULT_WORLDCUP_ICON_HEIGHT = 0;
    public static final List<TabSkin> DEFAULT_TAB_SKIN = Collections.emptyList();

    private WorldcupSkin(Builder builder, boolean z) {
        super(builder);
        if (z) {
            if (builder.worldcup_icon_height == null) {
                this.worldcup_icon_height = DEFAULT_WORLDCUP_ICON_HEIGHT;
            } else {
                this.worldcup_icon_height = builder.worldcup_icon_height;
            }
            if (builder.worldcup_bottom == null) {
                this.worldcup_bottom = "";
            } else {
                this.worldcup_bottom = builder.worldcup_bottom;
            }
            if (builder.worldcup_bottom_night == null) {
                this.worldcup_bottom_night = "";
            } else {
                this.worldcup_bottom_night = builder.worldcup_bottom_night;
            }
            if (builder.worldcup_top == null) {
                this.worldcup_top = "";
            } else {
                this.worldcup_top = builder.worldcup_top;
            }
            if (builder.worldcup_top_night == null) {
                this.worldcup_top_night = "";
            } else {
                this.worldcup_top_night = builder.worldcup_top_night;
            }
            if (builder.tab_skin == null) {
                this.tab_skin = DEFAULT_TAB_SKIN;
                return;
            } else {
                this.tab_skin = immutableCopyOf(builder.tab_skin);
                return;
            }
        }
        this.worldcup_icon_height = builder.worldcup_icon_height;
        this.worldcup_bottom = builder.worldcup_bottom;
        this.worldcup_bottom_night = builder.worldcup_bottom_night;
        this.worldcup_top = builder.worldcup_top;
        this.worldcup_top_night = builder.worldcup_top_night;
        this.tab_skin = immutableCopyOf(builder.tab_skin);
    }

    /* loaded from: classes16.dex */
    public static final class Builder extends Message.Builder<WorldcupSkin> {
        public List<TabSkin> tab_skin;
        public String worldcup_bottom;
        public String worldcup_bottom_night;
        public Integer worldcup_icon_height;
        public String worldcup_top;
        public String worldcup_top_night;

        public Builder() {
        }

        public Builder(WorldcupSkin worldcupSkin) {
            super(worldcupSkin);
            if (worldcupSkin != null) {
                this.worldcup_icon_height = worldcupSkin.worldcup_icon_height;
                this.worldcup_bottom = worldcupSkin.worldcup_bottom;
                this.worldcup_bottom_night = worldcupSkin.worldcup_bottom_night;
                this.worldcup_top = worldcupSkin.worldcup_top;
                this.worldcup_top_night = worldcupSkin.worldcup_top_night;
                this.tab_skin = WorldcupSkin.copyOf(worldcupSkin.tab_skin);
            }
        }

        /* JADX DEBUG: Method merged with bridge method */
        @Override // com.squareup.wire.Message.Builder
        public WorldcupSkin build(boolean z) {
            return new WorldcupSkin(this, z);
        }
    }
}
