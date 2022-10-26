package tbclient;

import com.baidu.android.imsdk.internal.Constants;
import com.baidu.titan.sdk.runtime.FieldHolder;
import com.baidu.titan.sdk.runtime.InitContext;
import com.baidu.titan.sdk.runtime.InterceptResult;
import com.baidu.titan.sdk.runtime.Interceptable;
import com.baidu.titan.sdk.runtime.TitanRuntime;
import com.squareup.wire.Message;
import com.squareup.wire.ProtoField;
/* loaded from: classes9.dex */
public final class GameHotRankEntry extends Message {
    public static /* synthetic */ Interceptable $ic = null;
    public static final String DEFAULT_ICON = "";
    public static final String DEFAULT_LINK_ICON = "";
    public static final String DEFAULT_LINK_NAME = "";
    public static final String DEFAULT_LINK_URL = "";
    public static final String DEFAULT_NAME = "";
    public transient /* synthetic */ FieldHolder $fh;
    @ProtoField(tag = 1, type = Message.Datatype.STRING)
    public final String icon;
    @ProtoField(tag = 5, type = Message.Datatype.STRING)
    public final String link_icon;
    @ProtoField(tag = 4, type = Message.Datatype.STRING)
    public final String link_name;
    @ProtoField(tag = 3, type = Message.Datatype.STRING)
    public final String link_url;
    @ProtoField(tag = 2, type = Message.Datatype.STRING)
    public final String name;

    /* loaded from: classes9.dex */
    public /* synthetic */ class a {
        public static /* synthetic */ Interceptable $ic;
        public transient /* synthetic */ FieldHolder $fh;
    }

    /* loaded from: classes9.dex */
    public final class Builder extends Message.Builder {
        public static /* synthetic */ Interceptable $ic;
        public transient /* synthetic */ FieldHolder $fh;
        public String icon;
        public String link_icon;
        public String link_name;
        public String link_url;
        public String name;

        public Builder() {
            Interceptable interceptable = $ic;
            if (interceptable != null) {
                InitContext newInitContext = TitanRuntime.newInitContext();
                interceptable.invokeUnInit(65536, newInitContext);
                int i = newInitContext.flag;
                if ((i & 1) != 0) {
                    int i2 = i & 2;
                    newInitContext.thisArg = this;
                    interceptable.invokeInitBody(65536, newInitContext);
                }
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public Builder(GameHotRankEntry gameHotRankEntry) {
            super(gameHotRankEntry);
            Interceptable interceptable = $ic;
            if (interceptable != null) {
                InitContext newInitContext = TitanRuntime.newInitContext();
                newInitContext.initArgs = r2;
                Object[] objArr = {gameHotRankEntry};
                interceptable.invokeUnInit(65537, newInitContext);
                int i = newInitContext.flag;
                if ((i & 1) != 0) {
                    int i2 = i & 2;
                    super((Message) newInitContext.callArgs[0]);
                    newInitContext.thisArg = this;
                    interceptable.invokeInitBody(65537, newInitContext);
                    return;
                }
            }
            if (gameHotRankEntry == null) {
                return;
            }
            this.icon = gameHotRankEntry.icon;
            this.name = gameHotRankEntry.name;
            this.link_url = gameHotRankEntry.link_url;
            this.link_name = gameHotRankEntry.link_name;
            this.link_icon = gameHotRankEntry.link_icon;
        }

        /* JADX DEBUG: Method merged with bridge method */
        @Override // com.squareup.wire.Message.Builder
        public GameHotRankEntry build(boolean z) {
            InterceptResult invokeZ;
            Interceptable interceptable = $ic;
            if (interceptable == null || (invokeZ = interceptable.invokeZ(Constants.METHOD_GET_CONTACTER_INFO_FOR_SESSION, this, z)) == null) {
                return new GameHotRankEntry(this, z, null);
            }
            return (GameHotRankEntry) invokeZ.objValue;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public GameHotRankEntry(Builder builder, boolean z) {
        super(builder);
        Interceptable interceptable = $ic;
        if (interceptable != null) {
            InitContext newInitContext = TitanRuntime.newInitContext();
            newInitContext.initArgs = r2;
            Object[] objArr = {builder, Boolean.valueOf(z)};
            interceptable.invokeUnInit(65536, newInitContext);
            int i = newInitContext.flag;
            if ((i & 1) != 0) {
                int i2 = i & 2;
                super((Message.Builder) newInitContext.callArgs[0]);
                newInitContext.thisArg = this;
                interceptable.invokeInitBody(65536, newInitContext);
                return;
            }
        }
        if (z) {
            String str = builder.icon;
            if (str == null) {
                this.icon = "";
            } else {
                this.icon = str;
            }
            String str2 = builder.name;
            if (str2 == null) {
                this.name = "";
            } else {
                this.name = str2;
            }
            String str3 = builder.link_url;
            if (str3 == null) {
                this.link_url = "";
            } else {
                this.link_url = str3;
            }
            String str4 = builder.link_name;
            if (str4 == null) {
                this.link_name = "";
            } else {
                this.link_name = str4;
            }
            String str5 = builder.link_icon;
            if (str5 == null) {
                this.link_icon = "";
                return;
            } else {
                this.link_icon = str5;
                return;
            }
        }
        this.icon = builder.icon;
        this.name = builder.name;
        this.link_url = builder.link_url;
        this.link_name = builder.link_name;
        this.link_icon = builder.link_icon;
    }

    public /* synthetic */ GameHotRankEntry(Builder builder, boolean z, a aVar) {
        this(builder, z);
    }
}
