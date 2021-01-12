package tbclient.GetTails;

import com.squareup.wire.Message;
import com.squareup.wire.ProtoField;
import java.util.Collections;
import java.util.List;
/* loaded from: classes8.dex */
public final class ResData extends Message {
    public static final String DEFAULT_DEFAULT_COLOR = "";
    @ProtoField(label = Message.Label.REPEATED, tag = 2)
    public final List<ColorInfo> colorList;
    @ProtoField(tag = 3, type = Message.Datatype.STRING)
    public final String default_color;
    @ProtoField(label = Message.Label.REPEATED, tag = 1)
    public final List<TailInfo> tailList;
    public static final List<TailInfo> DEFAULT_TAILLIST = Collections.emptyList();
    public static final List<ColorInfo> DEFAULT_COLORLIST = Collections.emptyList();

    private ResData(Builder builder, boolean z) {
        super(builder);
        if (z) {
            if (builder.tailList == null) {
                this.tailList = DEFAULT_TAILLIST;
            } else {
                this.tailList = immutableCopyOf(builder.tailList);
            }
            if (builder.colorList == null) {
                this.colorList = DEFAULT_COLORLIST;
            } else {
                this.colorList = immutableCopyOf(builder.colorList);
            }
            if (builder.default_color == null) {
                this.default_color = "";
                return;
            } else {
                this.default_color = builder.default_color;
                return;
            }
        }
        this.tailList = immutableCopyOf(builder.tailList);
        this.colorList = immutableCopyOf(builder.colorList);
        this.default_color = builder.default_color;
    }

    /* loaded from: classes8.dex */
    public static final class Builder extends Message.Builder<ResData> {
        public List<ColorInfo> colorList;
        public String default_color;
        public List<TailInfo> tailList;

        public Builder() {
        }

        public Builder(ResData resData) {
            super(resData);
            if (resData != null) {
                this.tailList = ResData.copyOf(resData.tailList);
                this.colorList = ResData.copyOf(resData.colorList);
                this.default_color = resData.default_color;
            }
        }

        /* JADX DEBUG: Method merged with bridge method */
        @Override // com.squareup.wire.Message.Builder
        public ResData build(boolean z) {
            return new ResData(this, z);
        }
    }
}
