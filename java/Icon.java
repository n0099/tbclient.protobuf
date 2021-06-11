package tbclient;

import com.squareup.wire.Message;
import com.squareup.wire.ProtoField;
import java.util.Collections;
import java.util.List;
/* loaded from: classes8.dex */
public final class Icon extends Message {
    public static final String DEFAULT_ICON = "";
    public static final String DEFAULT_NAME = "";
    public static final String DEFAULT_URL = "";
    @ProtoField(tag = 4, type = Message.Datatype.STRING)
    public final String icon;
    @ProtoField(tag = 1, type = Message.Datatype.STRING)
    public final String name;
    @ProtoField(tag = 7)
    public final Position position;
    @ProtoField(label = Message.Label.REPEATED, tag = 8, type = Message.Datatype.STRING)
    public final List<String> sprite_info;
    @ProtoField(tag = 6)
    public final Terminal terminal;
    @ProtoField(tag = 3, type = Message.Datatype.STRING)
    public final String url;
    @ProtoField(tag = 5, type = Message.Datatype.INT32)
    public final Integer value;
    @ProtoField(tag = 2, type = Message.Datatype.INT32)
    public final Integer weight;
    public static final Integer DEFAULT_WEIGHT = 0;
    public static final Integer DEFAULT_VALUE = 0;
    public static final List<String> DEFAULT_SPRITE_INFO = Collections.emptyList();

    /* loaded from: classes8.dex */
    public static final class Builder extends Message.Builder<Icon> {
        public String icon;
        public String name;
        public Position position;
        public List<String> sprite_info;
        public Terminal terminal;
        public String url;
        public Integer value;
        public Integer weight;

        public Builder() {
        }

        public Builder(Icon icon) {
            super(icon);
            if (icon == null) {
                return;
            }
            this.name = icon.name;
            this.weight = icon.weight;
            this.url = icon.url;
            this.icon = icon.icon;
            this.value = icon.value;
            this.terminal = icon.terminal;
            this.position = icon.position;
            this.sprite_info = Message.copyOf(icon.sprite_info);
        }

        /* JADX DEBUG: Method merged with bridge method */
        @Override // com.squareup.wire.Message.Builder
        public Icon build(boolean z) {
            return new Icon(this, z);
        }
    }

    public Icon(Builder builder, boolean z) {
        super(builder);
        if (z) {
            String str = builder.name;
            if (str == null) {
                this.name = "";
            } else {
                this.name = str;
            }
            Integer num = builder.weight;
            if (num == null) {
                this.weight = DEFAULT_WEIGHT;
            } else {
                this.weight = num;
            }
            String str2 = builder.url;
            if (str2 == null) {
                this.url = "";
            } else {
                this.url = str2;
            }
            String str3 = builder.icon;
            if (str3 == null) {
                this.icon = "";
            } else {
                this.icon = str3;
            }
            Integer num2 = builder.value;
            if (num2 == null) {
                this.value = DEFAULT_VALUE;
            } else {
                this.value = num2;
            }
            this.terminal = builder.terminal;
            this.position = builder.position;
            List<String> list = builder.sprite_info;
            if (list == null) {
                this.sprite_info = DEFAULT_SPRITE_INFO;
                return;
            } else {
                this.sprite_info = Message.immutableCopyOf(list);
                return;
            }
        }
        this.name = builder.name;
        this.weight = builder.weight;
        this.url = builder.url;
        this.icon = builder.icon;
        this.value = builder.value;
        this.terminal = builder.terminal;
        this.position = builder.position;
        this.sprite_info = Message.immutableCopyOf(builder.sprite_info);
    }
}
