package tbclient.GameForumGuideTab;

import com.baidu.android.imsdk.internal.Constants;
import com.baidu.titan.sdk.runtime.ClassClinitInterceptable;
import com.baidu.titan.sdk.runtime.ClassClinitInterceptorStorage;
import com.baidu.titan.sdk.runtime.FieldHolder;
import com.baidu.titan.sdk.runtime.InitContext;
import com.baidu.titan.sdk.runtime.InterceptResult;
import com.baidu.titan.sdk.runtime.Interceptable;
import com.baidu.titan.sdk.runtime.TitanRuntime;
import com.squareup.wire.Message;
import com.squareup.wire.ProtoField;
import java.util.Collections;
import java.util.List;
/* loaded from: classes10.dex */
public final class GameForumSubLabel extends Message {
    public static /* synthetic */ Interceptable $ic = null;
    public static final Integer DEFAULT_ID;
    public static final List<GameForumSubLabel> DEFAULT_SUB_LABEL_LIST;
    public static final String DEFAULT_SUB_TAB_NAME = "";
    public transient /* synthetic */ FieldHolder $fh;
    @ProtoField(tag = 1, type = Message.Datatype.INT32)
    public final Integer id;
    @ProtoField(label = Message.Label.REPEATED, tag = 3)
    public final List<GameForumSubLabel> sub_label_list;
    @ProtoField(tag = 2, type = Message.Datatype.STRING)
    public final String sub_tab_name;

    /* loaded from: classes10.dex */
    public static final class Builder extends Message.Builder<GameForumSubLabel> {
        public static /* synthetic */ Interceptable $ic;
        public transient /* synthetic */ FieldHolder $fh;
        public Integer id;
        public List<GameForumSubLabel> sub_label_list;
        public String sub_tab_name;

        public Builder() {
            Interceptable interceptable = $ic;
            if (interceptable != null) {
                InitContext newInitContext = TitanRuntime.newInitContext();
                interceptable.invokeUnInit(65536, newInitContext);
                int i2 = newInitContext.flag;
                if ((i2 & 1) != 0) {
                    int i3 = i2 & 2;
                    newInitContext.thisArg = this;
                    interceptable.invokeInitBody(65536, newInitContext);
                }
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public Builder(GameForumSubLabel gameForumSubLabel) {
            super(gameForumSubLabel);
            Interceptable interceptable = $ic;
            if (interceptable != null) {
                InitContext newInitContext = TitanRuntime.newInitContext();
                newInitContext.initArgs = r2;
                Object[] objArr = {gameForumSubLabel};
                interceptable.invokeUnInit(65537, newInitContext);
                int i2 = newInitContext.flag;
                if ((i2 & 1) != 0) {
                    int i3 = i2 & 2;
                    super((Message) newInitContext.callArgs[0]);
                    newInitContext.thisArg = this;
                    interceptable.invokeInitBody(65537, newInitContext);
                    return;
                }
            }
            if (gameForumSubLabel == null) {
                return;
            }
            this.id = gameForumSubLabel.id;
            this.sub_tab_name = gameForumSubLabel.sub_tab_name;
            this.sub_label_list = Message.copyOf(gameForumSubLabel.sub_label_list);
        }

        /* JADX DEBUG: Method merged with bridge method */
        @Override // com.squareup.wire.Message.Builder
        public GameForumSubLabel build(boolean z) {
            InterceptResult invokeZ;
            Interceptable interceptable = $ic;
            return (interceptable == null || (invokeZ = interceptable.invokeZ(Constants.METHOD_GET_CONTACTER_INFO_FOR_SESSION, this, z)) == null) ? new GameForumSubLabel(this, z, null) : (GameForumSubLabel) invokeZ.objValue;
        }
    }

    /* loaded from: classes10.dex */
    public static /* synthetic */ class a {
        public static /* synthetic */ Interceptable $ic;
        public transient /* synthetic */ FieldHolder $fh;
    }

    static {
        InterceptResult invokeClinit;
        ClassClinitInterceptable classClinitInterceptable = ClassClinitInterceptorStorage.$ic;
        if (classClinitInterceptable != null && (invokeClinit = classClinitInterceptable.invokeClinit(587244457, "Ltbclient/GameForumGuideTab/GameForumSubLabel;")) != null) {
            Interceptable interceptable = invokeClinit.interceptor;
            if (interceptable != null) {
                $ic = interceptable;
            }
            if ((invokeClinit.flags & 1) != 0) {
                classClinitInterceptable.invokePostClinit(587244457, "Ltbclient/GameForumGuideTab/GameForumSubLabel;");
                return;
            }
        }
        DEFAULT_ID = 0;
        DEFAULT_SUB_LABEL_LIST = Collections.emptyList();
    }

    public /* synthetic */ GameForumSubLabel(Builder builder, boolean z, a aVar) {
        this(builder, z);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public GameForumSubLabel(Builder builder, boolean z) {
        super(builder);
        Interceptable interceptable = $ic;
        if (interceptable != null) {
            InitContext newInitContext = TitanRuntime.newInitContext();
            newInitContext.initArgs = r2;
            Object[] objArr = {builder, Boolean.valueOf(z)};
            interceptable.invokeUnInit(65537, newInitContext);
            int i2 = newInitContext.flag;
            if ((i2 & 1) != 0) {
                int i3 = i2 & 2;
                super((Message.Builder) newInitContext.callArgs[0]);
                newInitContext.thisArg = this;
                interceptable.invokeInitBody(65537, newInitContext);
                return;
            }
        }
        if (z) {
            Integer num = builder.id;
            if (num == null) {
                this.id = DEFAULT_ID;
            } else {
                this.id = num;
            }
            String str = builder.sub_tab_name;
            if (str == null) {
                this.sub_tab_name = "";
            } else {
                this.sub_tab_name = str;
            }
            List<GameForumSubLabel> list = builder.sub_label_list;
            if (list == null) {
                this.sub_label_list = DEFAULT_SUB_LABEL_LIST;
                return;
            } else {
                this.sub_label_list = Message.immutableCopyOf(list);
                return;
            }
        }
        this.id = builder.id;
        this.sub_tab_name = builder.sub_tab_name;
        this.sub_label_list = Message.immutableCopyOf(builder.sub_label_list);
    }
}
